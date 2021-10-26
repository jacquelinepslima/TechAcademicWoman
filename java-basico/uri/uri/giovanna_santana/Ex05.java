package exercicio.uri.giovanna_santana;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int [][] matrizA = new int[M][N];
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                matrizA[i][j] = sc.nextInt();
            }
        }

        int [][] matrizB = new int[M][N];
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                matrizB[i][j] = sc.nextInt();
            }
        }

        int [][] matrizC = new int[M][N];
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
