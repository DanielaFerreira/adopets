package com.adopets.web.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author eddunic
 */

@Entity(name = "voluntario")
public class Voluntario extends Usuario {


    
    public Voluntario() {
    }

    public Voluntario(String email, String nome, String senha, String cpf_cnpj, Date dataNasc, String telefone, String bairro, byte[] foto) {
	super(email, nome, senha, cpf_cnpj, dataNasc, telefone, bairro, foto);
    }


    
}