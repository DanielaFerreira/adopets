package com.adopets.web.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author eddunic
 */

@Entity(name = "voluntario")
public class Voluntario extends Usuario {


    @ManyToOne
    @JoinColumn(name = "emailVoluntario", nullable = false)
    private Voluntario voluntario;
    
    public Voluntario() {
    }

    public Voluntario(String email, String nome, String senha, String cpf_cnpj, Date dataNasc, String telefone, String bairro, byte[] foto) {
	super(email, nome, senha, cpf_cnpj, dataNasc, telefone, bairro, foto);
    }


    
}