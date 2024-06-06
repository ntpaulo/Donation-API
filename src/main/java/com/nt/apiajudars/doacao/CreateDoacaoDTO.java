package com.nt.apiajudars.doacao;

import com.nt.apiajudars.item.Item;

import java.util.List;

public record CreateDoacaoDTO(Long doador_id, List<Item> itens) {
    public CreateDoacaoDTO(Doacao doacao) {
        this(doacao.getDoador().getId(), doacao.getItens());
    }
}
