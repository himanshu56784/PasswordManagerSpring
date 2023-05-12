package com.passwordManager.passwordManager.controllers;

import com.passwordManager.passwordManager.entity.Registration;
import com.passwordManager.passwordManager.entity.Sites;
import com.passwordManager.passwordManager.service.RegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @PostMapping("sites/save/{id}")
    public List<Sites> saveSites(@PathVariable("id") Long id,@RequestBody Sites sites)
    {
        return registrationService.saveSites(sites,id);
    }











}
