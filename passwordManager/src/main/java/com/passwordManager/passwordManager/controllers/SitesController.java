package com.passwordManager.passwordManager.controllers;

import com.passwordManager.passwordManager.dto.ResponseDTO;
import com.passwordManager.passwordManager.entity.Sites;
import com.passwordManager.passwordManager.repository.RegistrationRepository;
import com.passwordManager.passwordManager.service.RegistrationService;
import com.passwordManager.passwordManager.service.SitesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/sites")
public class SitesController {
    @Autowired
    private SitesService sitesService;

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/{id}")
    public ResponseEntity<List<Sites>> getSites(@PathVariable("id") Long id){
        return new ResponseEntity<>(registrationService.getSites(id), HttpStatus.OK);
    }


    @PostMapping("/save/{id}")
    public List<Sites> saveSites(@PathVariable("id") Long id, @RequestBody Sites sites)
    {
        Logger log= LoggerFactory.getLogger("sitesController");
        log.info(""+id+"\n");
        log.info(sites.getSiteName()+"\n");
        log.info(sites.getSiteUrl()+"\n");
        log.info(sites.getImageUrl());

        return registrationService.saveSites(sites,id);
    }
    @PostMapping("/update/{id}")
    public Sites updateSites(@PathVariable("id") Long id,@RequestBody Sites sites){
        return sitesService.updateSite(id,sites);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseDTO deleteSite(@PathVariable("id") Long id){
        sitesService.deleteSiteById(id);
        ResponseDTO responseDTO=new ResponseDTO();
        responseDTO.setId(id);
        responseDTO.setMsg("deletion successful");
        return responseDTO;
    }



}
