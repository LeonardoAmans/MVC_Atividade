package com.example.AtividadeMVC.models;

public class Comida {
    private String nome;
    private String restaurante;
    private boolean vegetariano;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public Comida(String nome, String restaurante, boolean vegetariano) {
        this.nome = nome;
        this.restaurante = restaurante;
        this.vegetariano = vegetariano;
    }
}


