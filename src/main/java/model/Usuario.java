package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author eduardo
 */

@Entity
public class Usuario implements Serializable {
   
    private String nome;
    
    @Id
    private String email;
    
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
