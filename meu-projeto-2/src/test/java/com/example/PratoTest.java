package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PratoTest {

    @Test
    public void testDescricaoPrato() {
        Prato prato = new Prato("Pizza Margherita", 40.00, "Pizza com molho de tomate, queijo e manjericão");
        assertEquals("Pizza Margherita - R$40.00: Pizza com molho de tomate, queijo e manjericão", prato.toString(),
                "A descrição do prato está incorreta.");
    }

}
