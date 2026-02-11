package com.lista_contatos.contato.dto;

import com.lista_contatos.contato.model.vo.Nome;
import com.lista_contatos.contato.model.vo.Numero;

public record CriarContatoRequest(
        Nome nome,
        Numero numero
) {
}
