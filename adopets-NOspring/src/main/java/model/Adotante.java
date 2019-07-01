package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author eddunic
 */
@Entity
public class Adotante extends Usuario {
    


    public Adotante() {
    }

    public Adotante(String email, String nome, String senha, String cpf_cnpj, String dataNasc, String telefone, String bairro, byte[] foto) {
	super(email, nome, senha, cpf_cnpj, dataNasc, telefone, bairro, foto);
    }


    
}