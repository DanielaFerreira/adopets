package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author eddunic
 */
@Entity
public class Admin extends Usuario {
    
    
    
    public Admin() {
    }

    public Admin(String email, String nome, String senha, String cpf_cnpj, String dataNasc, String telefone, String bairro, byte[] foto) {
	super(email, nome, senha, cpf_cnpj, dataNasc, telefone, bairro, foto);
    }

    
}