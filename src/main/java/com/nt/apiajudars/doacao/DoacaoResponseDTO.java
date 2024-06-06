<<<<<<< HEAD
package com.nt.apiajudars.doacao;

import com.nt.apiajudars.doador.Doador;

public record DoacaoResponseDTO(String id, Doador doador) {

    public DoacaoResponseDTO (Doacao doacao){
        this(doacao.getId(), doacao.getDoador());
    }
}
=======
package com.nt.apiajudars.doacao;

import com.nt.apiajudars.doador.Doador;

public record DoacaoResponseDTO(String id, Doador doador) {

    public DoacaoResponseDTO (Doacao doacao){
        this(doacao.getId(), doacao.getDoador());
    }
}
>>>>>>> 7d72da5 (ItemController - Concluído)
