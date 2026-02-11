package com.lista_contatos.contato.controller;

import com.lista_contatos.contato.dto.CriarContatoRequest;
import com.lista_contatos.contato.service.ContatoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/contato")
public class ContatoController {

    private final ContatoService contatoService;

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody CriarContatoRequest criarContatoRequest) {


        return ResponseEntity<contatoService.save();
    }
}
