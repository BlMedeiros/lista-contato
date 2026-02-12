package com.lista_contatos.contato.model.vo;

import com.lista_contatos.contato.exceptions.NumeroDeTelefoneInvalido;

public record Numero(String numero) {
    public Numero {
        if(numero == null || !numero.matches("\\d{10,11}")) {
            throw new NumeroDeTelefoneInvalido("O Número de Telefone Deve Conter de 10 a 11 Digitos.");
        }
    }

    public String formatar(String numero) {
        return "(" + numero.substring(0,2) + ")";
    }
}
