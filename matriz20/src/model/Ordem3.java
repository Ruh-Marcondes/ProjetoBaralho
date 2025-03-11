package model;

public class Ordem3 {

    int[][] matriz = new int[3][3];

    float det;

    float dp;

    public Ordem3(int[][] matriz) {
        this.matriz = matriz;
    }
    Ordem3(){

    }


    //regra de sarrus
    public float calcdet(){
        det = 0;

        return det;
    }

    public void exibirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("\t "+matriz[i][j]);
            }
        }
    }

    public void exibirdeterminante(){
        System.out.println("\nO determinante da matriz 3x3 é:  "+det);
    }
}
