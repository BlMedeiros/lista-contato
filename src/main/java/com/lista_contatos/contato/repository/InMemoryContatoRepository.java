package com.lista_contatos.contato.repository;

import com.lista_contatos.contato.model.Contato;

import java.util.List;

public class InMemoryContatoRepository implements ContatoRepository{
    @Override
    public void save(Contato contato) {

    }

    @Override
    public Contato findById(long id) {
        return null;
    }

    @Override
    public List<Contato> findAll() {
        return List.of();
    }
}
