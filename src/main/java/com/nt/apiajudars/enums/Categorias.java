package com.nt.apiajudars.enums;

public enum Categorias {

    ALIMENTO("Alimento"),
    ROUPA("Roupa"),
    HIGIENE_PESSOAL("Higiene-Pessoal"),
    LIMPEZA("Limpeza");

    private String categorias;

    Categorias(String categorias) {
        this.categorias = categorias;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }
}
