package com.passwordManager.passwordManager.service;

import com.passwordManager.passwordManager.entity.Sites;
import org.springframework.stereotype.Service;

@Service
public interface SitesService {
    Sites saveSite(Sites sites);
}
