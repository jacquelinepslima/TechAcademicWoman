package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int girarFila = 0;
        int linha = 0;
        int[][] matrizSoldados = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizSoldados[i][j] = scanner.nextInt();
            }
        }

        girarFila = scanner.nextInt();
        girarFila = girarFila - 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == girarFila - 1) {

                    matrizSoldados[i][j] = matrizSoldados[i - 1][j - 1];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizSoldados[i][j] + " ");
                System.out.println("");
            }

            scanner.close();
        }
    }
}
