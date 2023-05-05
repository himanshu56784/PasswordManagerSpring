package com.passwordManager.passwordManager.repository;

import com.passwordManager.passwordManager.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Long> {

}
