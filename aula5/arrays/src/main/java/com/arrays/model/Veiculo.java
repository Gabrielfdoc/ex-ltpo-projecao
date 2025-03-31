package main.java.com.arrays.model;

public class Veiculo {
    private String modelo;
    private int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String toString() {
        return "Modelo: " + modelo + ", Ano: " + ano;
    }
}
