import model.Ordem3;

public class Main {
    public static void main(String[] args) {
        // Exibindo a mensagem "Hello, World!"
        System.out.println("Hello, World!");

        // Definindo a matriz 3x3 de exemplo
        int[][] matrizExemplo = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        Ordem3 testaa = new Ordem3(matrizExemplo);


        testaa.exibirMatriz();

    }
}
