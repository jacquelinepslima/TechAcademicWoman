package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        int n, i, j, somaElem = 0;
        n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j > i) {
                    somaElem = somaElem + matriz[i][j];
                }
            }
        }
        System.out.printf("Soma: %d", somaElem);

        sc.close();
    }
}
