package com.passwordManager.passwordManager.service;

import com.passwordManager.passwordManager.entity.Registration;
import org.springframework.stereotype.Service;

@Service
public interface RegistrationService {
    Registration saveRegistration(Registration registration);
}
