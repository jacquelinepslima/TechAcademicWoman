package exercicio.uri.amanda_alves;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int[][] matriz = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int filaTroca = scanner.nextInt() - 1;
        int ultimo = matriz[filaTroca][N - 1];

        for (int j = N - 2; j >= 0; j--) {
            matriz[filaTroca][j + 1] = matriz[filaTroca][j];
        }

        matriz[filaTroca][0] = ultimo;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
