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
import javax.persistence.ManyToOne;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author daniela
 */
@Entity(name = "processoAnimal")
public class ProcessoAnimal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @JoinColumn(name = "processo")
    @ManyToMany
    private Processo processo;

    @Column(nullable = false)
    @JoinColumn(name = "animal")
    @ManyToMany
    private Animal animal;

    public ProcessoAnimal() {
    }

    public ProcessoAnimal(Long id, Processo processo, Animal animal) {
        this.id = id;
        this.processo = processo;
        this.animal = animal;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
