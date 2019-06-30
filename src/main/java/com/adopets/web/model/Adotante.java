package com.adopets.web.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author eddunic
 */
@Entity(name = "adotante")
public class Adotante extends Usuario {

    @ManyToMany
    @JoinTable(
            name = "criaAdotante",
            joinColumns = @JoinColumn(name = "email"),
            inverseJoinColumns = @JoinColumn(name = "processoId"))
    private List<Processo> processos;

    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }
   
    public List<Processo> getProcessos() {
        return processos;
    }

    public Adotante() {
    }

    public Adotante(String email, String nome, String senha, String cpf_cnpj, Date dataNasc, String telefone, String bairro, byte[] foto) {
        super(email, nome, senha, cpf_cnpj, dataNasc, telefone, bairro, foto);
    }

}
