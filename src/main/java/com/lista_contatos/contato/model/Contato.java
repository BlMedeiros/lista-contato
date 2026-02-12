package com.lista_contatos.contato.model;


import com.lista_contatos.contato.model.vo.Nome;
import com.lista_contatos.contato.model.vo.Numero;

public class Contato {
    private long id;
    private Nome nome;
    private Numero numero;

    public Contato(long id, Nome nome, Numero numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
    }

    public Contato(Nome nome, Numero numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }
}


