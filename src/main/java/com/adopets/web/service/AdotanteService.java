/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adopets.web.service;

import com.adopets.web.model.Adotante;
import com.adopets.web.repository.AdotanteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author daniela
 */

@Service
public class AdotanteService {
    	
	@Autowired
	private AdotanteRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos adotantes inseridos
	public List<Adotante> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um adotante a partir do ID
	public Adotante findOne(String email) {
		return repository.findOne(email);
	}
	
	//Salva ou atualiza um adotante
	public Adotante save(Adotante adotante) {
		return repository.saveAndFlush(adotante);
	}
	
	//Exclui um adotante
	public void delete(String email) {
		repository.delete(email);
	}
}
