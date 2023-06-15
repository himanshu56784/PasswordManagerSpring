package com.passwordManager.passwordManager.service.impl;

import com.passwordManager.passwordManager.dto.ResponseDTO;
import com.passwordManager.passwordManager.entity.Users;
import com.passwordManager.passwordManager.entity.Sites;
import com.passwordManager.passwordManager.repository.RegistrationRepository;
import com.passwordManager.passwordManager.service.RegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;
    @Override
    public Users saveRegistration(Users registration) {
        return registrationRepository.save(registration);
    }

    public Users getRegistrationById(Long id){
        return registrationRepository.getById(id);
    }

    @Override
    public List<Sites> saveSites(Sites sites, Long id) {
        Users registration = getRegistrationById(id);
        registration.addSite(sites);
        registrationRepository.save(registration);
        return registration.getSitesList();
    }

    public ResponseEntity<ResponseDTO> verifyuser(Users registration) {
        ResponseDTO loginDTO = new ResponseDTO();
        Users user = registrationRepository.findByUserEmail(registration.getUserEmail());
        if (user!=null && user.getUserEmail().equals(registration.getUserEmail())
                && user.getPassword().equals(registration.getPassword())
        ) {
            loginDTO.setId(user.getRegistrationId());
            loginDTO.setMsg("valid user");
            loginDTO.setValid(true);
            loginDTO.setObject(user);
            return new ResponseEntity<>(loginDTO, HttpStatus.OK);
        }
        return null;
    }

    @Override
    public List<Sites> getSites(Long id) {
        Logger logger= LoggerFactory.getLogger("registrationRepo");
        logger.info("" + id);
        Optional<Users> user = registrationRepository.findById(id);
        if(user.isPresent()) {;
            return user.get().getSitesList();
        }
        return null;
    }

    @Override
    public List<Users> getAllUsers() {
        return registrationRepository.findAll();
    }
}

