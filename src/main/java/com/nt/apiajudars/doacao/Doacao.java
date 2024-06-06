package com.nt.apiajudars.doacao;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.nt.apiajudars.doador.Doador;
import com.nt.apiajudars.item.Item;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "doacao")
@Entity(name = "doacao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Doacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doador_id", nullable= false)
    @JsonBackReference
    private Doador doador;

    @OneToMany(mappedBy = "doacao", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Item> itens;

    public Doacao(Doador doador){
        this.doador = doador;
    }


}
