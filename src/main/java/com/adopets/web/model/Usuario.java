package com.adopets.web.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author eduardo
 */
@Entity(name = "usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Usuario implements Serializable {

    @Id
    private String email;

    @Column(nullable = false)
    @Lob
    @NotBlank(message = "Nome é um dado obrigatório.")
    private String nome;

    @Column(nullable = false)
    @Lob
    @NotBlank(message = "Senha é um dado obrigatório.")
    private String senha;

    @Column(nullable = false)
    @Lob
    @NotBlank(message = "CPF/CNPJ é um dado obrigatório.")
    private String cpf_cnpj;

    @Column(nullable = false)
    @Lob
    @NotBlank(message = "Data de Nascimento é um dado obrigatório.")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataNasc;

    @Column(nullable = false)
    @Lob
    @NotBlank(message = "Bairro é um dado obrigatório.")
    private String bairro;

    private String telefone;

    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] foto;

    public Usuario() {
    }

    public Usuario(String email, String nome, String senha, String cpf_cnpj, Date dataNasc, String telefone, String bairro, byte[] foto) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.cpf_cnpj = cpf_cnpj;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.bairro = bairro;
        this.foto = foto;
    }

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

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

}
