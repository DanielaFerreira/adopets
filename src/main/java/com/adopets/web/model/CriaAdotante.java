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

@Entity(name = "criaAdotante")
public class CriaAdotante implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @JoinColumn(name = "adotante")
    @ManyToMany
    private Adotante adotante;

    @Column(nullable = false)
    @JoinColumn(name = "processo")
    @ManyToMany
    private Processo processo;

    public CriaAdotante() {
    }

    public CriaAdotante(Adotante adotante, Processo processo) {
        this.adotante = adotante;
        this.processo = processo;
    }

    public Adotante getAdotante() {
        return adotante;
    }

    public void setAdotante(Adotante adotante) {
        this.adotante = adotante;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

}
