package com.adopets.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adopets.web.model.Voluntario;

public interface VoluntarioRepository extends JpaRepository<Voluntario, String> { } 

