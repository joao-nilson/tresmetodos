package org.example;

public class FabricaPF implements AbstractFactory {

    @Override
    public Contrato createContrato() {
        return new ContratoPF();
    }

    @Override
    public Procuracao createProcuracao() {
        return new ProcuracaoPF();
    }
}
