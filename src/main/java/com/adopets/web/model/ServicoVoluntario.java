/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adopets.web.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author daniela
 */
@Entity(name = "servicoVoluntario")
public class ServicoVoluntario implements Serializable {

    @Id
    @Column(name = "numero")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero;

    @Column(nullable = false, name = "horario")
    @NotBlank(message = "Horário é um dado obrigatório.")
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm:ss")
    private Date horario;

    @Column(nullable = false)
    @NotBlank(message = "Data é um dado obrigatório.")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataS;

    @ManyToOne
    @JoinColumn(name = "idAnimal", nullable = false)
    private Animal animal;

    public ServicoVoluntario() {
    }

    public ServicoVoluntario(Long numero, Date horario, Date dataS, Animal animal) {
        this.numero = numero;
        this.horario = horario;
        this.dataS = dataS;
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Date getDataS() {
        return dataS;
    }

    public void setDataS(Date dataS) {
        this.dataS = dataS;
    }
}
