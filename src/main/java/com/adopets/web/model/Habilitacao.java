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
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author daniela
 */
@Entity(name = "habilitacao")
public class Habilitacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @JoinColumn(name = "voluntario")
    @ManyToMany
    private Voluntario voluntario;

    @Column(nullable = false)
    @JoinColumn(name = "servico")
    @ManyToMany
    private Servico servico;

    public Habilitacao() {
    }

    public Habilitacao(Long id, Voluntario voluntario, Servico servico) {
        this.id = id;
        this.voluntario = voluntario;
        this.servico = servico;
    }

    public Voluntario getVoluntario() {
        return voluntario;
    }

    public Servico getServico() {
        return servico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
