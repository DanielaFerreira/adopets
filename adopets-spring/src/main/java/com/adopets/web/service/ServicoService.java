package com.adopets.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopets.web.model.Servico;
import com.adopets.web.repository.ServicoRepository;

@Service //Define a classe como um bean do Spring
public class ServicoService {
	
	@Autowired
	private ServicoRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos servicos inseridos
	public List<Servico> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um servico a partir do ID
	public Servico findOne(Long id) {
		return repository.findOne(id);
	}
	
	//Salva ou atualiza um servico
	public Servico save(Servico servico) {
		return repository.saveAndFlush(servico);
	}
	
	//Exclui um servico
	public void delete(Long id) {
		repository.delete(id);
	}

}
