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

    @Column(nullable = false, name = "emailAdotante")
    private String emailAdotante;

    //numero do processo
    @Column(nullable = false, name = "numeroProcesso")
    private Long numeroProcesso;

    public CriaAdotante() {
    }

    public CriaAdotante(String emailAdotante, Long numProcesso) {
        this.emailAdotante = emailAdotante;
        this.numeroProcesso = numProcesso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailAdotante() {
        return emailAdotante;
    }

    public void setEmailAdotante(String emailAdotante) {
        this.emailAdotante = emailAdotante;
    }

    public Long getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(Long numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }
}
