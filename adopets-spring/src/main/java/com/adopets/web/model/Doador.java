package com.adopets.web.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author eddunic
 */
@Entity(name = "doador")
public class Doador extends Usuario {

    @ManyToMany
    @JoinTable(
            name = "criaDoador",
            joinColumns = @JoinColumn(name = "email"),
            inverseJoinColumns = @JoinColumn(name = "processoId"))
    private List<Processo> processos;

    public List<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }
    
    

    public Doador() {
    }

    public Doador(String email, String nome, String senha, String cpf_cnpj, Date dataNasc, String telefone, String bairro, byte[] foto) {
        super(email, nome, senha, cpf_cnpj, dataNasc, telefone, bairro, foto);
    }

}
