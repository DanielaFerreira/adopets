/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author eddunic
 */
@Entity
public class Animal implements Serializable {
    
    @Id 
    private Long codigo;
    
    private String nome;
    
    private String raça;
    
    private String dataNasc;
    
    private String sexo;
    
    private String tipo;
    
    private String necessidade;
    
    private String tempoEspera;
    
    private String foto;
    
    private String situacao;
    
    private String tamanho;
    
    private String descricao;

    
    public Animal() {
    }   
    
    public Animal(Long codigo, String nome, String raça, String dataNasc, String sexo, String tipo, String necessidade, String tempoEspera, String foto, String situacao, String tamanho, String descricao) {
	this.codigo = codigo;
	this.nome = nome;
	this.raça = raça;
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

    public Long getCodigo() {
	return codigo;
    }

    public void setCodigo(Long codigo) {
	this.codigo = codigo;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getRaça() {
	return raça;
    }

    public void setRaça(String raça) {
	this.raça = raça;
    }

    public String getDataNasc() {
	return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
	this.dataNasc = dataNasc;
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

    public String getFoto() {
	return foto;
    }

    public void setFoto(String foto) {
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
