package com.passwordManager.passwordManager.controllers;

import com.passwordManager.passwordManager.dto.ResponseDTO;
import com.passwordManager.passwordManager.entity.Passwords;
import com.passwordManager.passwordManager.service.PasswordService;

import org.apache.catalina.connector.ResponseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/password")
public class PasswordsController {

    @Autowired
    private PasswordService passwordService;
    @PostMapping("/save/{id}")
    public Passwords savePassword(@PathVariable("id") Long id, @RequestBody Passwords passwords){
        return passwordService.savePassword(id,passwords);
    }
    @GetMapping("{id}")
    public ResponseEntity<List<Passwords>> getAllPassword(@PathVariable("id") Long id){
        return new ResponseEntity<>(passwordService.getAllPassword(id), HttpStatus.OK);
    }

    @PostMapping("/update/{id}")
    public Passwords updatePassword(@PathVariable Long id,@RequestBody Passwords passwords){
        return passwordService.updatePassword(id,passwords);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseDTO deletePassword(@PathVariable Long id){
        passwordService.deletePassword(id);
        ResponseDTO responseDTO=new ResponseDTO();
        responseDTO.setMsg("deleted password");
        responseDTO.setValid(true);
        return responseDTO;
    }
}
