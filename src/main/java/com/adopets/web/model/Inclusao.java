/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adopets.web.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author daniela
 */
@Entity(name = "inclusao")
public class Inclusao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    @JoinColumn(name = "voluntario")
    @OneToMany
    private Voluntario voluntario;
    
    @Column(nullable = false)
    @JoinColumn(name = "servico")
    @ManyToMany
    private Servico servico;

    @JoinColumn(name = "servicoVoluntario")
    @ManyToMany
    private ServicoVoluntario servicoVoluntario;

    public Inclusao() {
    }

    public Inclusao(Long id, Voluntario voluntario, Servico servico, ServicoVoluntario servicoVoluntario) {
        this.id = id;
        this.voluntario = voluntario;
        this.servico = servico;
        this.servicoVoluntario = servicoVoluntario;
    }

    public void setVoluntario(Voluntario voluntario) {
        this.voluntario = voluntario;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public void setServicoVoluntario(ServicoVoluntario servicoVoluntario) {
        this.servicoVoluntario = servicoVoluntario;
    }
    
    

    public Voluntario getVoluntario() {
        return voluntario;
    }

    public Servico getServico() {
        return servico;
    }

    public ServicoVoluntario getServicoVoluntario() {
        return servicoVoluntario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
