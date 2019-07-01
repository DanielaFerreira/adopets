package com.adopets.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopets.web.model.CriaDoador;
import com.adopets.web.repository.CriaDoadorRepository;

@Service //Define a classe como um bean do Spring
public class CriaDoadorService {
	
	@Autowired
	private CriaDoadorRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos criaDoadors inseridos
	public List<CriaDoador> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um criaDoador a partir do ID
	public CriaDoador findOne(Long id) {
		return repository.findOne(id);
	}
	
	//Salva ou atualiza um criaDoador
	public CriaDoador save(CriaDoador criaDoador) {
		return repository.saveAndFlush(criaDoador);
	}
	
	//Exclui um criaDoador
	public void delete(Long id) {
		repository.delete(id);
	}

}
