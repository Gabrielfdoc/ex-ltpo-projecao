package main.java.com.arrays;

import main.java.com.arrays.model.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo[] garagem = new Veiculo[3];

        garagem[0] = new Veiculo("Gol", 2010);
        garagem[1] = new Veiculo("Civic", 2018);
        garagem[2] = new Veiculo("Corolla", 2020);

        for (Veiculo v : garagem) {
            System.out.println(v);
        }
    }
}