package com.adopets.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopets.web.model.Inclusao;
import com.adopets.web.repository.InclusaoRepository;

@Service //Define a classe como um bean do Spring
public class InclusaoService {
	
	@Autowired
	private InclusaoRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos inclusaos inseridos
	public List<Inclusao> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um inclusao a partir do ID
	public Inclusao findOne(Long id) {
		return repository.findOne(id);
	}
	
	//Salva ou atualiza um inclusao
	public Inclusao save(Inclusao inclusao) {
		return repository.saveAndFlush(inclusao);
	}
	
	//Exclui um inclusao
	public void delete(Long id) {
		repository.delete(id);
	}

}
