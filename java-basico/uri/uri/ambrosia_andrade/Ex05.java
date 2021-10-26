package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int[][] m1 = new int[M][N], m2 = new int[M][N], mSoma = new int[M][N];

        // Lendo as duas matrizes
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                m1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                m2[i][j] = scanner.nextInt();
            }
        }

        // Somando os valores
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                mSoma[i][j] = m1[i][j] + m2[i][j];
            }
        }

        // Mostrando a matriz soma
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                System.out.print(mSoma[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
