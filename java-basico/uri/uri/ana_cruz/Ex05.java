package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrizA = new int[m][n];
        int[][] matrizB = new int[m][n];
        int[][] matrizC = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrizA[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrizB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
