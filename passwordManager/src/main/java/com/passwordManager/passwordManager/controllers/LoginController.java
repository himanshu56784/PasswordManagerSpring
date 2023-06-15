package com.passwordManager.passwordManager.controllers;

import com.passwordManager.passwordManager.dto.ResponseDTO;
import com.passwordManager.passwordManager.entity.Users;
import com.passwordManager.passwordManager.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
    @Autowired()
    RegistrationService registrationService;
    @PostMapping("/")
    public ResponseEntity<ResponseDTO> verifyUser(@RequestBody Users registration){
        return registrationService.verifyuser(registration);
    }
}
