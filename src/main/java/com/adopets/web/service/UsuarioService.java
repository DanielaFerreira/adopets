/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adopets.web.service;

import com.adopets.web.model.Usuario;
import com.adopets.web.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author daniela
 */

@Service
public class UsuarioService {
    	
	@Autowired
	private UsuarioRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos usuarios inseridos
	public List<Usuario> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um usuario a partir do ID
	public Usuario findOne(String email) {
		return repository.findOne(email);
	}
	
	//Salva ou atualiza um usuario
	public Usuario save(Usuario usuario) {
		return repository.saveAndFlush(usuario);
	}
	
	//Exclui um usuario
	public void delete(String email) {
		repository.delete(email);
	}
}
