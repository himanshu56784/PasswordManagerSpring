package com.passwordManager.passwordManager.service;

import com.passwordManager.passwordManager.entity.Passwords;
import com.passwordManager.passwordManager.entity.Sites;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SitesService {
    void deleteSiteById(Long id);
    List<Passwords> savePassword(long id, Passwords passwords);
    Sites updateSite(Long id, Sites sites);
}
