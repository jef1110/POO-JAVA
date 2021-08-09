package Carro;

import Carro.Carro;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro(){{
            marca = "Fiat";
            modelo = "Ducato";
            numPassageiros = 10;
            capCombustivel = 100;
            consumoCombustivel = 17;
        }};

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia + " km");

        double qtdCombustivel10 = van.calcularCombustivel(10);
        System.out.println("qtdCombustivel10 = " + qtdCombustivel10);

    }
}
