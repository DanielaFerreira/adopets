package com.adopets.web.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "processo")
public class Processo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @NotBlank(message = "Motivo do processo é um dado obrigatório.")
    @Column(nullable = false)
    private String motivo;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataAdocao;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(nullable = false)
    @Lob
    @NotBlank(message = "Data de doação é um dado obrigatório.")
    private Date dataDoacao;

    @Lob
    private String autorizacao;

    @Lob
    private String situacao;

    @Column(nullable = false)
    @Lob
    @NotBlank(message = "Tipo é um dado obrigatório.")
    private String tipo;

    @Column(nullable = false)
    @JoinColumn(name = "adminAutoriza")
    @ManyToOne
    private Admin admAutoriza;

    @JoinColumn(name = "adminEncerra")
    @ManyToOne
    private Admin admEncerra;

    public Processo() {
    }

    public Processo(Long id, String motivo, Date dataAdocao, Date dataDoacao, String autorizacao, String situacao, String tipo, Admin admAutoriza, Admin admEncerra) {
        this.id = id;
        this.motivo = motivo;
        this.dataAdocao = dataAdocao;
        this.dataDoacao = dataDoacao;
        this.autorizacao = autorizacao;
        this.situacao = situacao;
        this.tipo = tipo;
        this.admAutoriza = admAutoriza;
        this.admEncerra = admEncerra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public Date getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(Date dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public String getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(String autorizacao) {
        this.autorizacao = autorizacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Admin getAdmAutoriza() {
        return admAutoriza;
    }

    public void setAdmAutoriza(Admin admAutoriza) {
        this.admAutoriza = admAutoriza;
    }

    public Admin getAdmEncerra() {
        return admEncerra;
    }

    public void setAdmEncerra(Admin admEncerra) {
        this.admEncerra = admEncerra;
    }

}
