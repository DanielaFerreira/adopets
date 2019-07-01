/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adopets.web.model;

import java.io.Serializable;
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
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author daniela
 */
@Entity(name = "processoAnimal")
public class ProcessoAnimal implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //numeroProcesso do processo
    @Column(nullable = false, name = "numeroProcesso")
    private Long numeroProcesso;

    //id do animal
    @Column(nullable = false, name = "idAnimal")
    private Long idAnimal;

    public ProcessoAnimal() {
    }

    public ProcessoAnimal(Long id, Long numeroProcesso, Long idAnimal) {
        this.id = id;
        this.numeroProcesso = numeroProcesso;
        this.idAnimal = idAnimal;
    }

    public Long getNumero() {
        return numeroProcesso;
    }

    public void setNumero(Long numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
