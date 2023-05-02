package com.passwordManager.passwordManager.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @RequestMapping("/abcd")
    public String demo(){
        return "wellcome";
    }
}
