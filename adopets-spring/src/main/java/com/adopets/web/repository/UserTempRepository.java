package com.adopets.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adopets.web.model.UserTemp;

@Repository
public interface UserTempRepository extends JpaRepository<UserTemp, String> { } 

