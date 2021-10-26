package exercicio.uri.natasha_busnardo;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] matriz = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        int troca = sc.nextInt();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (i == troca - 1 && j < N - 1) {
                    matriz[i][j] = matriz[i][j] + matriz[i][N - 1];
                    matriz[i][N - 1] = matriz[i][j] - matriz[i][N - 1];
                    matriz[i][j] = matriz[i][j] - matriz[i][N - 1];
                }
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
