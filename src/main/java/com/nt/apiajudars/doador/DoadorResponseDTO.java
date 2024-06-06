package com.nt.apiajudars.doador;

import com.nt.apiajudars.doacao.Doacao;

import java.util.List;

public record DoadorResponseDTO(Long id, String nome, String instagram) {

    public DoadorResponseDTO(Doador doador) {
        this(doador.getId(), doador.getNome(), doador.getInstagram());
    }
}
