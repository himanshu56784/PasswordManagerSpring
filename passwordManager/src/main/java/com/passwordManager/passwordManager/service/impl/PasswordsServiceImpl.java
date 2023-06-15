package com.passwordManager.passwordManager.service.impl;

import com.passwordManager.passwordManager.entity.Passwords;
import com.passwordManager.passwordManager.entity.Sites;
import com.passwordManager.passwordManager.repository.PasswordsRepository;
import com.passwordManager.passwordManager.repository.SitesRepository;
import com.passwordManager.passwordManager.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PasswordsServiceImpl implements PasswordService {
    @Autowired
    private SitesRepository sitesRepository;
    @Autowired
    private PasswordsRepository passwordsRepository;
    @Override
    @Transactional
    public Passwords   savePassword(Long id, Passwords passwords) {
    Sites sites = sitesRepository.getById(id);
    sites.addPassword(passwords);
    sitesRepository.save(sites);
    return passwords;
    }

    @Override
    public List<Passwords> getAllPassword(Long id) {
        Sites sites = sitesRepository.getById(id);
        return sites.getPasswordsList();
    }

    @Override
    @Transactional
    public Passwords updatePassword(Long id, Passwords passwords) {
        Passwords updatePassword = passwordsRepository.getById(id);
        updatePassword.setPassword(passwords.getPassword());
        updatePassword.setEmailId(passwords.getEmailId());
        updatePassword.setUserName(passwords.getUserName());
        passwordsRepository.save(updatePassword);
        return updatePassword;
    }

    @Override
    public void deletePassword(Long id) {
        passwordsRepository.deleteById(id);
    }


}
