package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author eduardo
 */
@Entity
public class UserTemp implements Serializable {

    @Id
    private String email;
    
    private String nome;

    private String senha;
    
    private String codigo;
   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}

