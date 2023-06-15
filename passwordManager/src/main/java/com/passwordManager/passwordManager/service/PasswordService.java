package com.passwordManager.passwordManager.service;

import com.passwordManager.passwordManager.entity.Passwords;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PasswordService {
    Passwords savePassword(Long id, Passwords passwords);

    List<Passwords> getAllPassword(Long id);

    Passwords updatePassword(Long id, Passwords passwords);

    void deletePassword(Long id);
}
