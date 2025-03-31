package main.java.com.produtos.model;

public class CategoriasDeProdutos {
    public static void exibirCategoria(int codigoProduto) {
        switch (codigoProduto) {
            case 1:
                System.out.println("Categoria: Eletrônicos");
                break;
            case 2:
                System.out.println("Categoria: Alimentos");
                break;
            case 3:
                System.out.println("Categoria: Vestuário");
                break;
            case 4:
                System.out.println("Categoria: Livros");
                break;
            default:
                System.out.println("Categoria não cadastrada");
                break;
        }
    }
}
