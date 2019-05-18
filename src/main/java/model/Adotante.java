/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author eddunic
 */
@Entity
public class Adotante extends Usuario {
    
    @Id
    private String email;
    

    public Adotante() {
    }

    public Adotante(String email, String nome, String senha, String cpf_cnpj, String dataNasc, String telefone, String bairro, String foto) {
	super(email, nome, senha, cpf_cnpj, dataNasc, telefone, bairro, foto);
    }

    @Override
    public String getEmail() {
	return email;
    }

    @Override
    public void setEmail(String email) {
	this.email = email;
    }
    
}
