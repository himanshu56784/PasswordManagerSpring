package com.passwordManager.passwordManager.repository;

import com.passwordManager.passwordManager.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Users,Long> {
    public Users findByUserEmail(String userEmail);
}
