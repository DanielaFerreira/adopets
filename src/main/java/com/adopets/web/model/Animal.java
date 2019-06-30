package com.adopets.web.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "animal") //Define o nome da tabela que será criada no banco de dados
public class Animal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Lob
    @NotBlank(message = "Raca é um dado obrigatório.")
    private String raca;

    @Column(nullable = false)
    @Lob
    @NotBlank(message = "Sexo é um dado obrigatório.")
    private String sexo;

    @Column(nullable = false)
    @Lob
    @NotBlank(message = "Tipo é um dado obrigatório.")
    private String tipo;

    @Column(columnDefinition = "longblob")
    @Lob
    @NotBlank(message = "Foto é um dado obrigatório.")
    private byte[] foto;

    @Column(nullable = false)
    @Lob
    @NotBlank(message = "Situação é um dado obrigatório.")
    private String situacao;

    @Column(nullable = false)
    @Lob
    @NotBlank(message = "Tamanho é um dado obrigatório.")
    private String tamanho;

    private String necessidade;

    private String tempoEspera;

    private String descricao;

    private String nome;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataNasc;

    public Animal() {
    }

    public Animal(Long id, String nome, String raca, Date dataNasc, String sexo, String tipo, String necessidade, String tempoEspera, byte[] foto, String situacao, String tamanho, String descricao) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.tipo = tipo;
        this.necessidade = necessidade;
        this.tempoEspera = tempoEspera;
        this.foto = foto;
        this.situacao = situacao;
        this.tamanho = tamanho;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date data) {
        this.dataNasc = data;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNecessidade() {
        return necessidade;
    }

    public void setNecessidade(String necessidade) {
        this.necessidade = necessidade;
    }

    public String getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(String tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
