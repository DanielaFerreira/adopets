package com.adopets.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adopets.web.model.Animal;

@Repository //Define a classe como um bean do Spring
public interface AnimalRepository extends JpaRepository<Animal, Long> { } 
//Deve estender JpaRepository e declarar a entidade (Animal) e o tipo de chave primária (Long)

