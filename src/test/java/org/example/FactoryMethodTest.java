package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        assertSame(FactoryMethod.getInstance(), FactoryMethod.getInstance());
    }

    @Test
    void deveRetornarFabricaPF() {
        AbstractFactory fabrica = FactoryMethod.getInstance().getFabrica("PF");
        assertInstanceOf(FabricaPF.class, fabrica);
    }

    @Test
    void deveRetornarFabricaPJ() {
        AbstractFactory fabrica = FactoryMethod.getInstance().getFabrica("PJ");
        assertInstanceOf(FabricaPJ.class, fabrica);
    }

    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            AbstractFactory fabrica = FactoryMethod.getInstance().getFabrica("PN");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inexistente", e.getMessage());
        }
    }

}
