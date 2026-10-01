package org.example;

public class Main {
    public static void main(String[] args) {
        AbstractFactory fabricaPF = FactoryMethod.getInstance().getFabrica("PF");
        Cliente clientePF = new Cliente(fabricaPF);
        System.out.println(clientePF.emitirContrato());
        System.out.println(clientePF.emitirProcuracao());

        AbstractFactory fabricaPJ = FactoryMethod.getInstance().getFabrica("PJ");
        Cliente clientePJ = new Cliente(fabricaPJ);
        System.out.println(clientePJ.emitirContrato());
        System.out.println(clientePJ.emitirProcuracao());

        System.out.println("Mesma instância do FactoryMethod (Singleton)? "
                + (FactoryMethod.getInstance() == FactoryMethod.getInstance()));
    }
}
