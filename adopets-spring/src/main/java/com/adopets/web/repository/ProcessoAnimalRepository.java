package com.adopets.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adopets.web.model.ProcessoAnimal;

@Repository
public interface ProcessoAnimalRepository extends JpaRepository<ProcessoAnimal, Long> { }

