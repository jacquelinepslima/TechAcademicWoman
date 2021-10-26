package exercicio.uri.samyra_figueiredo;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m, n, i, j;

        m = sc.nextInt();
        n = sc.nextInt();

        int[][] matrizA = new int[m][n];
        int[][] matrizB = new int[m][n];
        int[][] matrizC = new int[m][n];

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                matrizA[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                matrizB[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        for (i = 0; i < matrizC.length; i++) {
            for (j = 0; j < matrizC[i].length; j++) {
                System.out.printf("[" + matrizC[i][j] + "]" + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
