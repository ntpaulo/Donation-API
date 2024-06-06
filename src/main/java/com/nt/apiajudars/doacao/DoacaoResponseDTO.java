package com.nt.apiajudars.doacao;

import com.nt.apiajudars.doador.Doador;
import com.nt.apiajudars.item.Item;

import java.util.List;

public record DoacaoResponseDTO(Long id, Long doador_id, List<Item> itens) {

    public DoacaoResponseDTO (Doacao doacao){
        this(doacao.getId(), doacao.getDoador().getId(), doacao.getItens());
    }
}
