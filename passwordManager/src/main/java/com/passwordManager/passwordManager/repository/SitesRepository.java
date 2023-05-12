package com.passwordManager.passwordManager.repository;

import com.passwordManager.passwordManager.entity.Sites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SitesRepository extends JpaRepository<Sites,String> {
}
