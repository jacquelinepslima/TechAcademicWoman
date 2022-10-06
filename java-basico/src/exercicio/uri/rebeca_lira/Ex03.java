package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];
        int maiorElemento = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                }
            } System.out.println(maiorElemento);
            maiorElemento = 0;
        }

        scanner.close();
    }
}
