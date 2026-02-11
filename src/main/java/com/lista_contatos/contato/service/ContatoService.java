package com.lista_contatos.contato.service;

import com.lista_contatos.contato.model.Contato;
import com.lista_contatos.contato.repository.ContatoRepository;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

    ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    public void save(Contato contato) {
        contatoRepository.save(contato);
    }
}
