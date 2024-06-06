<<<<<<< HEAD
package com.nt.apiajudars.doacao;

import com.nt.apiajudars.item.Item;

import java.util.List;

public record CreateDoacaoDTO(String doador_id, List<Item> itens) {
    public CreateDoacaoDTO(Doacao doacao) {
        this(doacao.getDoador().getId(), doacao.getItens());
    }
}
=======
package com.nt.apiajudars.doacao;

import com.nt.apiajudars.item.Item;

import java.util.List;

public record CreateDoacaoDTO(String doador_id, List<Item> itens) {
    public CreateDoacaoDTO(Doacao doacao) {
        this(doacao.getDoador().getId(), doacao.getItens());
    }
}
>>>>>>> 7d72da5 (ItemController - Concluído)
