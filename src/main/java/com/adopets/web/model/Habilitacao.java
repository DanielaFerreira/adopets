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

    //email do voluntario
    @Column(nullable = false, name = "emailVoluntario")
    private String emailVoluntario;

    //id do servico
    @Column(nullable = false, name = "codigoServico")
    private Long codigoServico;

    public Habilitacao() {
    }

    public Habilitacao(Long id, String emVoluntario, Long codServico) {
        this.id = id;
        this.emailVoluntario = emVoluntario;
        this.codigoServico = codServico;
    }

    public String getEmailVoluntario() {
        return emailVoluntario;
    }

    public void setEmailVoluntario(String emailVoluntario) {
        this.emailVoluntario = emailVoluntario;
    }

    public Long getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(Long codigoServico) {
        this.codigoServico = codigoServico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
