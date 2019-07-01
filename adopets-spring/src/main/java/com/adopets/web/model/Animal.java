package com.adopets.web.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
    @Column(name = "idAnimal")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(nullable = false, name = "raca")
    @NotBlank(message = "Raca é um dado obrigatório.")
    private String raca;

    @Basic
    @Column(nullable = false, name = "sexo")
    @NotBlank(message = "Sexo é um dado obrigatório.")
    private String sexo;

    @Basic
    @Column(nullable = false, name = "tipo")
    @NotBlank(message = "Tipo é um dado obrigatório.")
    private String tipo;

    @Column(columnDefinition = "longblob", name = "foto")
    @Lob
    private byte[] foto;

    @Basic
    @Column(nullable = false, name = "situacao")
    @NotBlank(message = "Situação é um dado obrigatório.")
    private String situacao;

    @Basic
    @Column(nullable = false, name = "tamanho")
    @NotBlank(message = "Tamanho é um dado obrigatório.")
    private String tamanho;

    @Basic
    @Column(nullable = true, name = "necessidade")
    private String necessidade;

    @Basic
    @Column(nullable = true, name = "tempoEspera")
    private String tempoEspera;

    @Basic
    @Column(nullable = true, name = "descricao")
    private String descricao;

    @Basic
    @Column(nullable = true, name = "nome")
    private String nome;

    @Column(nullable = true, name = "dataNasc")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataNasc;

    @ManyToMany
    @JoinTable(
            name = "processoAnimal",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "processoId"))
    private List<Processo> processos;

    public List<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }
    
    

    public Animal() {
        this.id = null;
        this.nome = "";
        this.raca = "";
        this.dataNasc = null;
        this.sexo = "";
        this.tipo = "";
        this.necessidade = "";
        this.tempoEspera = "";
        this.foto = null;
        this.situacao = "";
        this.tamanho = "";
        this.descricao = "";
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

    public Animal(Animal animal) {
        this.nome = animal.getNome();
        this.raca = animal.getRaca();
        this.dataNasc = animal.getDataNasc();
        this.sexo = animal.getSexo();
        this.tipo = animal.getTipo();
        this.necessidade = animal.getNecessidade();
        this.tempoEspera = animal.getTempoEspera();
        this.foto = animal.getFoto();
        this.situacao = animal.getSituacao();
        this.tamanho = animal.getTamanho();
        this.descricao = animal.getDescricao();
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
