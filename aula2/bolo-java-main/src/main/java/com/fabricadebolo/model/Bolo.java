package main.java.com.fabricadebolo.model;

public class Bolo {
    String sabor;
    int tamanho;

    public Bolo(String sabor, int tamanho) {
        this.sabor = sabor;
        this.tamanho = tamanho;
    }

    //Exibe detalhes do bolo
    public void exibeDetalhes() {
        System.out.println("main.java.com.fabricadebolo.model.Bolo de " + sabor + " de " + tamanho + "cm");
    }
}