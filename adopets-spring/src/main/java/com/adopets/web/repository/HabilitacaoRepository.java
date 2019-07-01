package com.adopets.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adopets.web.model.Habilitacao;

@Repository //Define a classe como um bean do Spring
public interface HabilitacaoRepository extends JpaRepository<Habilitacao, Long> { }

