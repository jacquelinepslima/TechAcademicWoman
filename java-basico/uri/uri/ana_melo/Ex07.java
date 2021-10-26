package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];
        int[][] matrizB = new int[m][n];

        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        int fila = sc.nextInt() - 1;

        matrizB[fila][0] = matriz[fila][n-1];

        for(int i = 0; i < n-1; i++){
            matrizB[fila][i+1] = matriz[fila][i];
        }

        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if(i != fila){
                    matrizB[i][j] = matriz[i][j];
                }
            }
        }


        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
