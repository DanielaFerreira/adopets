package com.adopets.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adopets.web.model.Habilitacao;
import com.adopets.web.repository.HabilitacaoRepository;

@Service //Define a classe como um bean do Spring
public class HabilitacaoService {
	
	@Autowired
	private HabilitacaoRepository repository; //Injeta o repositório
	
	//Retorna uma lista com todos habilitacaos inseridos
	public List<Habilitacao> findAll() {
		return repository.findAll(); 
	}
	
	//Retorno um habilitacao a partir do ID
	public Habilitacao findOne(Long id) {
		return repository.findOne(id);
	}
	
	//Salva ou atualiza um habilitacao
	public Habilitacao save(Habilitacao habilitacao) {
		return repository.saveAndFlush(habilitacao);
	}
	
	//Exclui um habilitacao
	public void delete(Long id) {
		repository.delete(id);
	}

}
