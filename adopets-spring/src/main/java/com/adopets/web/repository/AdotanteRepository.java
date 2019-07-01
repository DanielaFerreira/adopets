package com.adopets.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adopets.web.model.Adotante;

@Repository
public interface AdotanteRepository extends JpaRepository<Adotante, String> { } 

