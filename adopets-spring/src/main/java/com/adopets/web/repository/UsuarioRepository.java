package com.adopets.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adopets.web.model.Usuario;

@Repository //Define a classe como um bean do Spring
public interface UsuarioRepository extends JpaRepository<Usuario, String> { } 
//Deve estender JpaRepository e declarar a entidade (Usuario) e o tipo de chave primária (Long)

