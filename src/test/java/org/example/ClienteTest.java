package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirContratoPF() {
        AbstractFactory fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Física", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPJ() {
        AbstractFactory fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Jurídica", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        AbstractFactory fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Física", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        AbstractFactory fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Jurídica", cliente.emitirProcuracao());
    }

}
