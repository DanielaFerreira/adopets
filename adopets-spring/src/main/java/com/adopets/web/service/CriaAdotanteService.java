package com.adopets.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopets.web.model.CriaAdotante;
import com.adopets.web.repository.CriaAdotanteRepository;

@Service //Define a classe como um bean do Spring
public class CriaAdotanteService {
	
	@Autowired
	private CriaAdotanteRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos criaAdotantes inseridos
	public List<CriaAdotante> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um criaAdotante a partir do ID
	public CriaAdotante findOne(Long id) {
		return repository.findOne(id);
	}
	
	//Salva ou atualiza um criaAdotante
	public CriaAdotante save(CriaAdotante criaAdotante) {
		return repository.saveAndFlush(criaAdotante);
	}
	
	//Exclui um criaAdotante
	public void delete(Long id) {
		repository.delete(id);
	}

}
