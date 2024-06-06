package com.nt.apiajudars.doador;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.nt.apiajudars.doacao.Doacao;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "doadores")
@Entity(name = "doador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")


public class Doador {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String instagram;

    @OneToMany(mappedBy = "doador", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Doacao> doacoes;

    public Doador(CreateDoadorDTO data){
        this.nome = data.nome();
        this.instagram = data.instagram();
    }
}
