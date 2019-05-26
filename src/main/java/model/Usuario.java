package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author eduardo
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Usuario implements Serializable {

    @Id    
    private String email;

    private String nome;

    private String senha;

    private String cpf_cnpj;

    private String dataNasc;

    private String telefone;

    private String bairro;
    
    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] foto;
    

    public Usuario() {
    }
    
    public Usuario(String email, String nome, String senha, String cpf_cnpj, String dataNasc, String telefone, String bairro, byte[] foto) {
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
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