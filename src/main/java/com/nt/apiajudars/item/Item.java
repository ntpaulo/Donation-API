package com.nt.apiajudars.item;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.nt.apiajudars.doacao.Doacao;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "Item")
@Entity(name = "Item")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Categoria categoria;

    private Integer quantidade;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "doacao_id", nullable = false)
    private Doacao doacao;

    public Item(String nome, Integer quantidade, Categoria categoria, Doacao doacao) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.doacao = doacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Doacao getDoacao() {
        return doacao;
    }

    public void setDoacao(Doacao doacao) {
        this.doacao = doacao;
    }
}
