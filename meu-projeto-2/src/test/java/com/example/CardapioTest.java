package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class CardapioTest {

    @Test
    public void testInicializacaoCardapio() {
        Cardapio cardapio = new Cardapio();
        assertTrue(cardapio.getPratos().isEmpty(), "O cardápio deveria estar vazio após a inicialização.");
    }

    @Test
    public void testAdicionarPrato() {
        // Arranjo
        Cardapio cardapio = new Cardapio();
        Prato prato = new Prato("Pizza Margherita", 40.00, "Pizza com molho de tomate, queijo e manjericão");

        // Ação
        cardapio.adicionarPrato(prato);

        // Verificação
        List<Prato> pratos = cardapio.getPratos();
        assertEquals(1, pratos.size(), "O prato não foi adicionado corretamente.");
        assertTrue(pratos.contains(prato), "O prato não foi encontrado na lista.");
    }

    @Test
    public void testRemoverPrato() {
        // Arranjo
        Cardapio cardapio = new Cardapio();
        Prato prato1 = new Prato("Pizza Margherita", 40.00, "Pizza com molho de tomate, queijo e manjericão");
        cardapio.adicionarPrato(prato1);

        // Ação
        cardapio.removerPrato(prato1);

        // Verificação
        List<Prato> pratos = cardapio.getPratos();
        assertEquals(0, pratos.size(), "O prato não foi removido corretamente.");
        assertFalse(pratos.contains(prato1), "O prato ainda está na lista.");
    }
}
