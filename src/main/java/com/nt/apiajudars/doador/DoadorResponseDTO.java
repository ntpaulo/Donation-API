<<<<<<< HEAD
package com.nt.apiajudars.doador;

import com.nt.apiajudars.doacao.Doacao;

import java.util.List;

public record DoadorResponseDTO(String id, String nome, String instagram, List<Doacao> doacoes) {

    public DoadorResponseDTO(Doador doador) {
        this(doador.getId(), doador.getNome(), doador.getInstagram(), doador.getDoacoes());
    }
}
=======
package com.nt.apiajudars.doador;

import com.nt.apiajudars.doacao.Doacao;

import java.util.List;

public record DoadorResponseDTO(String id, String nome, String instagram, List<Doacao> doacoes) {

    public DoadorResponseDTO(Doador doador) {
        this(doador.getId(), doador.getNome(), doador.getInstagram(), doador.getDoacoes());
    }
}
>>>>>>> 7d72da5 (ItemController - Concluído)
