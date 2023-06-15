package com.passwordManager.passwordManager.service.impl;

import com.passwordManager.passwordManager.entity.Passwords;
import com.passwordManager.passwordManager.entity.Sites;
import com.passwordManager.passwordManager.repository.SitesRepository;
import com.passwordManager.passwordManager.service.SitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SitesServiceImpl implements SitesService {
    @Autowired
    private SitesRepository sitesRepository;
    @Override
    public void deleteSiteById(Long id){
        sitesRepository.deleteById(id);
    }

    public Sites getSiteById(Long id){
        return sitesRepository.getById(id);
    }


    @Override
    public List<Passwords> savePassword(long id, Passwords passwords) {
        Sites sites = getSiteById(id);
        sites.addPassword(passwords);
        sitesRepository.save(sites);
        return sites.getPasswordsList();
    }

    @Override
    public Sites updateSite(Long id, Sites sites) {
        Sites toUpdatedSite = sitesRepository.getById(id);
        toUpdatedSite.setSiteName(sites.getSiteName());
        toUpdatedSite.setSiteUrl(sites.getSiteUrl());
        toUpdatedSite.setImageUrl(sites.getImageUrl());
        sitesRepository.save(toUpdatedSite);
        return toUpdatedSite;
    }


}
