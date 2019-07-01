package com.adopets.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adopets.web.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> { } 

