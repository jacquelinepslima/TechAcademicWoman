package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();


        int[][] matrizA = new int[M][N];
        int[][] matrizB = new int[M][N];
        int[][] matrizC = new int[M][N];

        for (int i = 0; i < M; i++) { // linha
            for (int j = 0; j < N; j++) { //coluna
                matrizA[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < M; i++) { // linha
            for (int j = 0; j < N; j++) { //coluna
                matrizB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < M; i++) { //linha
            for (int j = 0; j < N; j++) { //coluna
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        for (int i = 0; i < M; i++) { // linha
            for (int j = 0; j < N; j++) { //coluna
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println(" ");
        }

        sc.close();
    }

}