package com.adopets.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adopets.web.model.CriaDoador;

@Repository
public interface CriaDoadorRepository extends JpaRepository<CriaDoador, Long> { } 

