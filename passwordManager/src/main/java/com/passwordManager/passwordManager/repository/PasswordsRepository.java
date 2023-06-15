package com.passwordManager.passwordManager.repository;

import com.passwordManager.passwordManager.entity.Passwords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordsRepository extends JpaRepository<Passwords,Long> {
}
