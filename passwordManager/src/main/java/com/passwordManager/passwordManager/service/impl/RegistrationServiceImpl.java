package com.passwordManager.passwordManager.service.impl;

import com.passwordManager.passwordManager.entity.Registration;
import com.passwordManager.passwordManager.repository.RegistrationRepository;
import com.passwordManager.passwordManager.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;
    @Override
    public Registration saveRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }
}
