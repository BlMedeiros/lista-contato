package com.lista_contatos.contato.service;

import com.lista_contatos.contato.dto.CriarContatoRequest;
import com.lista_contatos.contato.model.Contato;
import com.lista_contatos.contato.repository.ContatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    public void save(CriarContatoRequest contatoRequest) {
        Contato contato = new Contato(
          contatoRequest.nome(),
          contatoRequest.numero()
        );

        contatoRepository.save(contato);
    }

    public List<Contato> findAll() {
        return contatoRepository.findAll();
    }

    public Contato findById(long id) {
        return contatoRepository.findById(id);
    }

    public Contato update(long id, Contato contatoAtualizado) {
        return contatoRepository.update(id, contatoAtualizado);
    }
}
