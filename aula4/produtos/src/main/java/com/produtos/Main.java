package main.java.com.produtos;

import main.java.com.produtos.model.CategoriasDeProdutos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigoProduto = scanner.nextInt();

        CategoriasDeProdutos.exibirCategoria(codigoProduto);

        scanner.close();
    }
}