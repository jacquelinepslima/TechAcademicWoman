package exercicio.uri.amanda_alves;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int[][] matriz = new int[M][N];
        int[][] matriz2 = new int[M][N];
        int[][] matrizTotal = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrizTotal[i][j] = matriz[i][j] + matriz2[i][j];
                System.out.print(matrizTotal[i][j] + " ");
            }
            System.out.println();
        }

    }
}
