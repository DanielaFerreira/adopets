package com.adopets.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopets.web.model.Processo;
import com.adopets.web.repository.ProcessoRepository;

@Service //Define a classe como um bean do Spring
public class ProcessoService {
	
	@Autowired
	private ProcessoRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos processos inseridos
	public List<Processo> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um processo a partir do ID
	public Processo findOne(Long id) {
		return repository.findOne(id);
	}
	
	//Salva ou atualiza um processo
	public Processo save(Processo processo) {
		return repository.saveAndFlush(processo);
	}
	
	//Exclui um processo
	public void delete(Long id) {
		repository.delete(id);
	}

}
