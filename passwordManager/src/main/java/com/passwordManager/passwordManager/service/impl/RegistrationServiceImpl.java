package com.passwordManager.passwordManager.service.impl;

import com.passwordManager.passwordManager.entity.Registration;
import com.passwordManager.passwordManager.entity.Sites;
import com.passwordManager.passwordManager.repository.RegistrationRepository;
import com.passwordManager.passwordManager.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;
    @Override
    public Registration saveRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    public Registration getRegistrationById(Long id){
        return registrationRepository.getById(id);
    }

    @Override
    public List<Sites> saveSites(Sites sites, Long id) {
        Registration registration = getRegistrationById(id);
        registration.addSite(sites);
        registrationRepository.save(registration);
        return registration.getSitesList();
    }
}
