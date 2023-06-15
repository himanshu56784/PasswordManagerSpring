package com.passwordManager.passwordManager.controllers;

import com.passwordManager.passwordManager.entity.Users;
import com.passwordManager.passwordManager.service.RegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/registration")
public class RegistrationController {

    Logger logger= LoggerFactory.getLogger(RegistrationController.class);
    @Autowired
    private RegistrationService registrationService;
    @PostMapping("/save")
    public Users saveRegistration(@RequestBody Users registration) {
       logger.info("inside save registration");
        return registrationService.saveRegistration(registration);
    }

    @GetMapping("/")
    private List<Users> getAllUsers(){
        return registrationService.getAllUsers();
    }
}
