package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void testAdicionarPrato() {
        // Arranjo
        Prato prato = new Prato("Pizza Margherita", 40.00, "Pizza com molho de tomate, queijo e manjericão");
        Pedido pedido = new Pedido(1, "João");

        // Ação
        pedido.adicionarPrato(prato);

        // Verificação
        assertEquals(40.00, pedido.calcularTotal(), "O total do pedido não está correto após adicionar o prato.");
    }

    @Test
    public void testCalcularTotalPedido() {
        Cardapio cardapio = new Cardapio();
        Prato prato1 = new Prato("Pizza Margherita", 40.00, "Pizza com molho de tomate, queijo e manjericão");
        Prato prato2 = new Prato("Hambúrguer", 25.00, "Hambúrguer com carne, queijo e alface");
        cardapio.adicionarPrato(prato1);
        cardapio.adicionarPrato(prato2);

        Pedido pedido = new Pedido(1, "João");
        pedido.adicionarPrato(prato1);
        pedido.adicionarPrato(prato2);

        assertEquals(65.00, pedido.calcularTotal(), 0.01, "O total do pedido está incorreto.");
    }
}
