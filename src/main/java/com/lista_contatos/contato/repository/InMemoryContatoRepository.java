package com.lista_contatos.contato.repository;

import com.lista_contatos.contato.exceptions.ContatoNaoEncontradoException;
import com.lista_contatos.contato.model.Contato;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemoryContatoRepository implements ContatoRepository{

    private final List<Contato> contatoList = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public void save(Contato contato) {
        if(contato.getId() == 0) {
            contato.setId(idGenerator.getAndIncrement());
        }
        contatoList.add(contato);
    }

    @Override
    public Contato findById(long id) {
        return contatoList.stream()
                .filter(contato -> contato.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ContatoNaoEncontradoException("Contato não encontrado com o identificador: " + id));
    }

    @Override
    public List<Contato> findAll() {
        return contatoList;
    }

    @Override
    public Contato update(long id, Contato contatoAtualizado) {
        Contato contatoExistente = findById(id);

        contatoExistente.setNome(contatoAtualizado.getNome());
        contatoExistente.setNumero(contatoAtualizado.getNumero());

        return contatoExistente;
    }
}
