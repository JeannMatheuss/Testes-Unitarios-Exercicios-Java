package com.example;

import java.util.ArrayList;

public class Pedido {
    private int numeroPedido;
    private String cliente;
    private ArrayList<Prato> listaDePratos;
    private double total;

    // Construtor
    public Pedido(int numeroPedido, String cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.listaDePratos = new ArrayList<>();
        this.total = 0;
    }

    // Método para adicionar um prato ao pedido
    public void adicionarPrato(Prato prato) {
        listaDePratos.add(prato);
        total += prato.getPreco();
    }

    // Método para remover um prato do pedido
    public void removerPrato(Prato prato) {
        if (listaDePratos.contains(prato)) {
            listaDePratos.remove(prato);
            total -= prato.getPreco();
        }
    }

    // Método para calcular o total do pedido
    public double calcularTotal() {
        return total;
    }

    // Método para visualizar os detalhes do pedido
    public void visualizarPedido() {
        System.out.println("Pedido nº " + numeroPedido + " - Cliente: " + cliente);
        System.out.println("Pratos:");
        for (Prato prato : listaDePratos) {
            System.out.println("- " + prato);
        }
        System.out.println("Total: R$" + String.format("%.2f", total));
    }
}
