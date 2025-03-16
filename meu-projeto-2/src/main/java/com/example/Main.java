package com.example;

public class Main {
    public static void main(String[] args) {
        // Criando pratos
        Prato prato1 = new Prato("Pizza Margherita", 40.00, "Pizza com molho de tomate, queijo e manjericão");
        Prato prato2 = new Prato("Hambúrguer", 25.00, "Hambúrguer com carne, queijo e alface");

        // Criando o cardápio
        Cardapio cardapio = new Cardapio();
        cardapio.adicionarPrato(prato1);
        cardapio.adicionarPrato(prato2);

        // Listando pratos no cardápio
        cardapio.listarPratos();

        // Criando um pedido
        Pedido pedido = new Pedido(1, "João");

        // Adicionando pratos ao pedido
        pedido.adicionarPrato(prato1);
        pedido.adicionarPrato(prato2);

        // Visualizando o pedido
        pedido.visualizarPedido();

        // Removendo um prato do pedido
        pedido.removerPrato(prato2);

        // Visualizando o pedido após a remoção
        pedido.visualizarPedido();
    }
}


// Projeto finalizado