package org.example;

public class FabricaPJ implements AbstractFactory {

    @Override
    public Contrato createContrato() {
        return new ContratoPJ();
    }

    @Override
    public Procuracao createProcuracao() {
        return new ProcuracaoPJ();
    }
}
