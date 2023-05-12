package com.passwordManager.passwordManager.repository;

import com.passwordManager.passwordManager.entity.Registration;
import com.passwordManager.passwordManager.entity.Sites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Long> {

}
