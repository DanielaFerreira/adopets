package com.adopets.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopets.web.model.ProcessoAnimal;
import com.adopets.web.repository.ProcessoAnimalRepository;

@Service //Define a classe como um bean do Spring
public class ProcessoAnimalService {
	
	@Autowired
	private ProcessoAnimalRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos processoAnimals inseridos
	public List<ProcessoAnimal> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um processoAnimal a partir do ID
	public ProcessoAnimal findOne(Long id) {
		return repository.findOne(id);
	}
	
	//Salva ou atualiza um processoAnimal
	public ProcessoAnimal save(ProcessoAnimal processoAnimal) {
		return repository.saveAndFlush(processoAnimal);
	}
	
	//Exclui um processoAnimal
	public void delete(Long id) {
		repository.delete(id);
	}

}
