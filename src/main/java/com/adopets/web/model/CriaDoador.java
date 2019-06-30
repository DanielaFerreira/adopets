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

@Entity(name = "criaDoador")
public class CriaDoador implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @JoinColumn(name = "doador")
    @ManyToMany
    private Doador doador;

    @Column(nullable = false)
    @JoinColumn(name = "processo")
    @ManyToMany
    private Processo processo;

    public CriaDoador() {
    }

    public CriaDoador(Doador doador, Processo processo) {
        this.doador = doador;
        this.processo = processo;
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public Processo getNumProc() {
        return processo;
    }

    public void setNumProc(Processo numProc) {
        this.processo = processo;
    }

}
