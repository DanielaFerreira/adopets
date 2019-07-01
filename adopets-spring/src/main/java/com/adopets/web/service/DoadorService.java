/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adopets.web.service;

import com.adopets.web.model.Doador;
import com.adopets.web.repository.DoadorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author daniela
 */

@Service
public class DoadorService {
    	
	@Autowired
	private DoadorRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos doadors inseridos
	public List<Doador> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um doador a partir do ID
	public Doador findOne(String email) {
		return repository.findOne(email);
	}
	
	//Salva ou atualiza um doador
	public Doador save(Doador doador) {
		return repository.saveAndFlush(doador);
	}
	
	//Exclui um doador
	public void delete(String email) {
		repository.delete(email);
	}
}
