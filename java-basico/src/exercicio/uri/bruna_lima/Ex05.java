package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int m = entrada.nextInt();
        int n = entrada.nextInt();

        int[][] matrizA = new int[m][n];
        int[][] matrizB = new int[m][n];
        int[][] matriz_soma = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrizA[i][j] = entrada.nextInt();
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrizB[i][j] = entrada.nextInt();
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matriz_soma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matriz_soma[i][j] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}
