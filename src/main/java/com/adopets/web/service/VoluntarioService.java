/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adopets.web.service;

import com.adopets.web.model.Voluntario;
import com.adopets.web.repository.VoluntarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author daniela
 */

@Service
public class VoluntarioService {
    	
	@Autowired
	private VoluntarioRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos voluntarios inseridos
	public List<Voluntario> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um voluntario a partir do ID
	public Voluntario findOne(String email) {
		return repository.findOne(email);
	}
	
	//Salva ou atualiza um voluntario
	public Voluntario save(Voluntario voluntario) {
		return repository.saveAndFlush(voluntario);
	}
	
	//Exclui um voluntario
	public void delete(String email) {
		repository.delete(email);
	}
}
