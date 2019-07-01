package com.adopets.web.model;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author eduardo
 */
@Entity(name = "userTemp")
public class UserTemp implements Serializable {

    @Id
    @Column(name = "email")
    private String email;

    @Column(nullable = false, name = "nome")
    @Basic
    @NotBlank(message = "Nome é um dado obrigatório.")
    private String nome;

    @Column(nullable = false, name = "senha")
    @Basic
    @NotBlank(message = "Senha é um dado obrigatório.")
    private String senha;

    @Column(nullable = false, name= "codigo")
    @Basic
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
