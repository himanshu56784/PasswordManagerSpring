package com.passwordManager.passwordManager.service;

import com.passwordManager.passwordManager.dto.ResponseDTO;
import com.passwordManager.passwordManager.entity.Users;
import com.passwordManager.passwordManager.entity.Sites;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegistrationService {
    Users saveRegistration(Users registration);

    List<Sites> saveSites(Sites sites, Long id);
    ResponseEntity<ResponseDTO> verifyuser(Users registration);

    List<Sites> getSites(Long id);

    List<Users> getAllUsers();
}
