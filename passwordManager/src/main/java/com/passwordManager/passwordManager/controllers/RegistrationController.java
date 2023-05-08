package com.passwordManager.passwordManager.controllers;

import com.passwordManager.passwordManager.entity.Registration;
import com.passwordManager.passwordManager.service.RegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/registration")
public class RegistrationController {

    Logger logger= LoggerFactory.getLogger(RegistrationController.class);
    @Autowired
    private RegistrationService registrationService;
    @PostMapping("/save")
    public Registration saveRegistration(@RequestBody Registration registration) {
       logger.info("inside save registration");
        return registrationService.saveRegistration(registration);
    }



}
