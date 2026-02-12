package com.lista_contatos.contato.exceptions;

public class ContatoNaoEncontradoException extends RuntimeException {
    public ContatoNaoEncontradoException(String message) {
        super(message);
    }
}
