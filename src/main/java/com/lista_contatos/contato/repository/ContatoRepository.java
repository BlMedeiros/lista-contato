package com.lista_contatos.contato.repository;

import com.lista_contatos.contato.model.Contato;

import java.util.List;

public interface ContatoRepository {

    void save(Contato contato);

    Contato findById(long id);

    List<Contato> findAll();

    Contato update(long id, Contato contatoAtualizado);

}
