/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adopets.web.service;

import com.adopets.web.model.UserTemp;
import com.adopets.web.repository.UserTempRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author daniela
 */

@Service
public class UserTempService {
    	
	@Autowired
	private UserTempRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos userTemps inseridos
	public List<UserTemp> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um userTemp a partir do ID
	public UserTemp findOne(String email) {
		return repository.findOne(email);
	}
	
	//Salva ou atualiza um userTemp
	public UserTemp save(UserTemp userTemp) {
		return repository.saveAndFlush(userTemp);
	}
	
	//Exclui um userTemp
	public void delete(String email) {
		repository.delete(email);
	}
}
