/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adopets.web.service;

import com.adopets.web.model.Admin;
import com.adopets.web.repository.AdminRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author daniela
 */

@Service
public class AdminService {
    	
	@Autowired
	private AdminRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos admins inseridos
	public List<Admin> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um admin a partir do ID
	public Admin findOne(String email) {
		return repository.findOne(email);
	}
	
	//Salva ou atualiza um admin
	public Admin save(Admin admin) {
		return repository.saveAndFlush(admin);
	}
	
	//Exclui um admin
	public void delete(String email) {
		repository.delete(email);
	}
}
