package com.passwordManager.passwordManager.controllers;

import com.passwordManager.passwordManager.entity.Sites;
import com.passwordManager.passwordManager.service.SitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sites")
public class SitesController {
    @Autowired
    private SitesService sitesService;

    @PostMapping("/save")
    public Sites saveSite(@RequestBody Sites sites){
        return sitesService.saveSite(sites);
    }
}
