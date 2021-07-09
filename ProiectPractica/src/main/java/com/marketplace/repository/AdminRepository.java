package com.marketplace.repository;

import com.marketplace.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>, AdminCustom {
    Optional<Admin> findByEmail(String email);
}
