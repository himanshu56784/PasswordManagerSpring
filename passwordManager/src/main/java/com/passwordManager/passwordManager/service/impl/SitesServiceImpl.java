package com.passwordManager.passwordManager.service.impl;

import com.passwordManager.passwordManager.entity.Sites;
import com.passwordManager.passwordManager.repository.SitesRepository;
import com.passwordManager.passwordManager.service.SitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SitesServiceImpl implements SitesService {
    @Autowired
    private SitesRepository sitesRepository;
    @Override
    public Sites saveSite(Sites sites) {
        return sitesRepository.save(sites);
    }
}
