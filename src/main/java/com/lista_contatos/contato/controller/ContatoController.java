package com.lista_contatos.contato.controller;

import com.lista_contatos.contato.dto.CriarContatoRequest;
import com.lista_contatos.contato.model.Contato;
import com.lista_contatos.contato.service.ContatoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoController {

    private final ContatoService contatoService;

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody CriarContatoRequest criarContatoRequest) {

        contatoService.save(criarContatoRequest);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/find_all")
    public ResponseEntity<List<Contato>> findAll() {

        List<Contato> contatoList = contatoService.findAll();

        return ResponseEntity.status(HttpStatus.OK)
                .body(contatoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contato> find(@PathVariable long id) {
        Contato contato = contatoService.findById(id);

        return ResponseEntity.status(HttpStatus.OK)
                .body(contato);
    }

    @PutMapping("/update")
    public ResponseEntity<Contato> update(@PathVariable long id, @PathVariable Contato contato) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(contatoService.update(id,contato));
    }

    @DeleteMapping()
    public
}
