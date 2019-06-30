package com.adopets.web.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "criaDoador")
public class CriaDoador implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "emailDoador")
    private String emailDoador;

    //numero do processo
    @Column(nullable = false, name = "numeroProcesso")
    private Long numeroProcesso;

    public CriaDoador() {
    }

    public CriaDoador(String emailDoador, Long numProcesso) {
        this.emailDoador = emailDoador;
        this.numeroProcesso = numProcesso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailDoador() {
        return emailDoador;
    }

    public void setEmailDoador(String emailDoador) {
        this.emailDoador = emailDoador;
    }

    public Long getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(Long numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

}
