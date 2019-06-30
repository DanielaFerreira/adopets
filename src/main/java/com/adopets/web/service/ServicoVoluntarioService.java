package com.adopets.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopets.web.model.ServicoVoluntario;
import com.adopets.web.repository.ServicoVoluntarioRepository;

@Service //Define a classe como um bean do Spring
public class ServicoVoluntarioService {
	
	@Autowired
	private ServicoVoluntarioRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos servicoVoluntarios inseridos
	public List<ServicoVoluntario> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um servicoVoluntario a partir do ID
	public ServicoVoluntario findOne(Long id) {
		return repository.findOne(id);
	}
	
	//Salva ou atualiza um servicoVoluntario
	public ServicoVoluntario save(ServicoVoluntario servicoVoluntario) {
		return repository.saveAndFlush(servicoVoluntario);
	}
	
	//Exclui um servicoVoluntario
	public void delete(Long id) {
		repository.delete(id);
	}

}
