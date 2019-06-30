package com.adopets.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adopets.web.model.CriaAdotante;

@Repository
public interface CriaAdotanteRepository extends JpaRepository<CriaAdotante, Long> { } 

