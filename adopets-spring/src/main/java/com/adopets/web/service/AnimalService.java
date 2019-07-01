package com.adopets.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopets.web.model.Animal;
import com.adopets.web.repository.AnimalRepository;

@Service //Define a classe como um bean do Spring
public class AnimalService {
	
	@Autowired
	private AnimalRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos animals inseridos
	public List<Animal> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um animal a partir do ID
	public Animal findOne(Long id) {
		return repository.findOne(id);
	}
	
	//Salva ou atualiza um animal
	public Animal save(Animal animal) {
		return repository.saveAndFlush(animal);
	}
	
	//Exclui um animal
	public void delete(Long id) {
		repository.delete(id);
	}

}
