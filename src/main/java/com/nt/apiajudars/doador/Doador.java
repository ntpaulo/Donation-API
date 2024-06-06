<<<<<<< HEAD
package com.nt.apiajudars.doador;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.nt.apiajudars.doacao.Doacao;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "doadores")
@Entity(name = "doador")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")


public class Doador {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;

    private String instagram;

    @OneToMany(mappedBy = "doador", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Doacao> doacoes;

    public Doador(DoadorRequestDTO data){
        this.nome = data.nome();
        this.instagram = data.instagram();
    }
}
=======
package com.nt.apiajudars.doador;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.nt.apiajudars.doacao.Doacao;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "doadores")
@Entity(name = "doador")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")


public class Doador {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;

    private String instagram;

    @OneToMany(mappedBy = "doador", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Doacao> doacoes;

    public Doador(DoadorRequestDTO data){
        this.nome = data.nome();
        this.instagram = data.instagram();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public List<Doacao> getDoacoes() {
        return doacoes;
    }
}
>>>>>>> 7d72da5 (ItemController - Concluído)
