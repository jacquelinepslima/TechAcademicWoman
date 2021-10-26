package exercicio.uri.valquiria_matter;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] valores = new int[n][n];
        int[] maiorElemento = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                valores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (valores[i][j] > maiorElemento[i]) {
                    maiorElemento[i] = valores[i][j];
                }
            }
            System.out.println(maiorElemento[i]);
        }
        sc.close();
    }
}
