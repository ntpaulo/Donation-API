<<<<<<< HEAD
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

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

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
=======
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
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Doacao {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
>>>>>>> 7d72da5 (ItemController - Concluído)
