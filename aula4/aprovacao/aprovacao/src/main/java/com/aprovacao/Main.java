package main.java.com.aprovacao;

import main.java.com.aprovacao.model.VerificaAprovacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        float notaDigitada = scanner.nextFloat();

        VerificaAprovacao verificaAprovacao = new VerificaAprovacao(notaDigitada);

        String resultadoFinal = verificaAprovacao.verificarNota(notaDigitada);
        System.out.println("Resultado: " + resultadoFinal);

        scanner.close();

    }
}