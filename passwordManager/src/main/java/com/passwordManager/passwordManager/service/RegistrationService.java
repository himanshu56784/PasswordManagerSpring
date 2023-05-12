package com.passwordManager.passwordManager.service;

import com.passwordManager.passwordManager.entity.Registration;
import com.passwordManager.passwordManager.entity.Sites;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegistrationService {
    Registration saveRegistration(Registration registration);

    List<Sites> saveSites(Sites sites, Long id);
}
