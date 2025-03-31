package main.java.com.aprovacao.model;

public class VerificaAprovacao {
    private float nota;
    private String resultado;

    public VerificaAprovacao(float nota) {
        this.nota = nota;
    }

    public String verificarNota(float nota) {

        if (nota < 0 || nota > 10 ) {
            resultado = "Digite uma nota válida!";

        } else if (nota >= 6){
            resultado = "Aprovado";

        } else if (nota >= 5) {
            resultado = "Recuperação";
        } else {
            resultado = "Reprovado";
        }
        return resultado;
    }
}
