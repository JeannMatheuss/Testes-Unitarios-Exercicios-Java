package com.example;

public class Prato {
    private String nome;
    private double preco;
    private String descricao;

    // Construtor
    public Prato(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    // Método para exibir informações do prato
    @Override
    public String toString() {
        return nome + " - R$" + String.format("%.2f", preco) + ": " + descricao;
    }
}