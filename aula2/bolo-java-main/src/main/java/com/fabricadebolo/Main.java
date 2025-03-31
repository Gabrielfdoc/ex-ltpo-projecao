package main.java.com.fabricadebolo;

import main.java.com.fabricadebolo.model.Bolo;

public class Main {
    public static void main(String[] args) {
        //Cria novo bolo e exibe bolo criado
        Bolo bolo = new Bolo("Chocolate", 20);
        bolo.exibeDetalhes();
    }
} 