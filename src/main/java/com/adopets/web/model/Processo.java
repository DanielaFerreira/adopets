package com.adopets.web.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "processo")
public class Processo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "numero")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero;

    @Basic
    @NotBlank(message = "Motivo do processo é um dado obrigatório.")
    @Column(nullable = false, name = "motivo")
    private String motivo;

    @Column(nullable = true, name = "dataAdocao")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataAdocao;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(nullable = false, name = "dataDoacao")
    @NotBlank(message = "Data de doação é um dado obrigatório.")
    private Date dataDoacao;

    @Basic
    @Column(nullable = true, name = "autorizacao")
    private String autorizacao;

    @Basic
    @Column(nullable = true, name = "situacao")
    private String situacao;

    @Column(nullable = false, name = "tipo")
    @Basic
    @NotBlank(message = "Tipo é um dado obrigatório.")
    private String tipo;

    @JoinColumn(name = "adminAutoriza", nullable = false)
    @ManyToOne
    private Admin admAutoriza;

    @JoinColumn(name = "adminEncerra", nullable = true)
    @ManyToOne
    private Admin admEncerra;

    @ManyToMany
    @JoinTable(
            name = "criaAdotante",
            joinColumns = @JoinColumn(name = "numeroProcesso"),
            inverseJoinColumns = @JoinColumn(name = "emailAdotante"))
    private List<Adotante> adotantes;

    @ManyToMany
    @JoinTable(
            name = "criaDoador",
            joinColumns = @JoinColumn(name = "numeroProcesso"),
            inverseJoinColumns = @JoinColumn(name = "emailDoador"))
    private List<Doador> doadores;

    @ManyToMany
    @JoinTable(
            name = "processoAnimal",
            joinColumns = @JoinColumn(name = "numeroProcesso"),
            inverseJoinColumns = @JoinColumn(name = "idAnimal"))
    private List<Animal> animais;

    public Processo() {
        this.numero = null;
        this.motivo = "";
        this.dataAdocao = null;
        this.dataDoacao = null;
        this.autorizacao = "";
        this.situacao = "";
        this.tipo = "";
        this.admAutoriza = null;
        this.admEncerra = null;
        animais = new ArrayList<>();
        doadores = new ArrayList<>();
        adotantes = new ArrayList<>();
    }

    public Processo(Long numero, String motivo, Date dataAdocao, Date dataDoacao, String autorizacao, String situacao, String tipo, Admin admAutoriza, Admin admEncerra, Animal animal, Doador doador, Adotante adotante) {
        this.numero = numero;
        this.motivo = motivo;
        this.dataAdocao = dataAdocao;
        this.dataDoacao = dataDoacao;
        this.autorizacao = autorizacao;
        this.situacao = situacao;
        this.tipo = tipo;
        this.admAutoriza = admAutoriza;
        this.admEncerra = admEncerra;
        animais.add(animal);
        doadores.add(doador);
        adotantes.add(adotante);
    }

    public List<Adotante> getAdotantes() {
        return adotantes;
    }

    public void setAdotantes(List<Adotante> adotantes) {
        this.adotantes = adotantes;
    }

    public List<Doador> getDoadores() {
        return doadores;
    }

    public void setDoadores(List<Doador> doadores) {
        this.doadores = doadores;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    public Animal getAnimal(Long idAnimal) {
        Animal animal = new Animal();
        for (int i = 0; i < animais.size(); i++) {
            if (animais.get(i).getId().equals(idAnimal)) {
                animal = animais.get(i);
            }
        }
        return animal;
    }

    public Doador getDoador(String emailDoador) {
        Doador doador = new Doador();
        for (int i = 0; i < doadores.size(); i++) {
            if (doadores.get(i).getEmail().equals(emailDoador)) {
                doador = doadores.get(i);
            }
        }
        return doador;
    }

    public Adotante getAdotante(String emailAdotante) {
        Adotante adotante = new Adotante();
        for (int i = 0; i < adotantes.size(); i++) {
            if (adotantes.get(i).getEmail().equals(emailAdotante)) {
                adotante = adotantes.get(i);
            }
        }
        return adotante;
    }

    public void setAnimal(Animal animal) {
        for (int i = 0; i < animais.size(); i++) {
            if (animais.get(i).getId().equals(animal.getId())) {
                animais.get(i).setDataNasc(animal.getDataNasc());
                animais.get(i).setDescricao(animal.getDescricao());
                animais.get(i).setFoto(animal.getFoto());
                animais.get(i).setNecessidade(animal.getNecessidade());
                animais.get(i).setNome(animal.getNome());
                animais.get(i).setRaca(animal.getRaca());
                animais.get(i).setSexo(animal.getSexo());
                animais.get(i).setSituacao(animal.getSituacao());
                animais.get(i).setTamanho(animal.getTamanho());
                animais.get(i).setTempoEspera(animal.getTempoEspera());
                animais.get(i).setTipo(animal.getTipo());
            }
        }
    }

    public void setDoador(Doador doador) {
        for (int i = 0; i < doadores.size(); i++) {
            if (doadores.get(i).getEmail().equals(doador.getEmail())) {
                doadores.get(i).setBairro(doador.getBairro());
                doadores.get(i).setCpf_cnpj(doador.getCpf_cnpj());
                doadores.get(i).setDataNasc(doador.getDataNasc());
                doadores.get(i).setFoto(doador.getFoto());
                doadores.get(i).setNome(doador.getNome());
                doadores.get(i).setSenha(doador.getSenha());
                doadores.get(i).setTelefone(doador.getTelefone());
            }
        }
    }

    public void setAdotante(Adotante adotante) {
        for (int i = 0; i < adotantes.size(); i++) {
            if (adotantes.get(i).getEmail().equals(adotante.getEmail())) {
                adotantes.get(i).setBairro(adotante.getBairro());
                adotantes.get(i).setCpf_cnpj(adotante.getCpf_cnpj());
                adotantes.get(i).setDataNasc(adotante.getDataNasc());
                adotantes.get(i).setFoto(adotante.getFoto());
                adotantes.get(i).setNome(adotante.getNome());
                adotantes.get(i).setSenha(adotante.getSenha());
                adotantes.get(i).setTelefone(adotante.getTelefone());
            }
        }
    }
    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
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
