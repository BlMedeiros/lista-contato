package com.lista_contatos.contato.model;


public class Contato {
    private long id;
    private String nome;
    private long numero;

    public Contato(long id, String nome, long numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
    }

    public Contato(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
}


