package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int M,N,linha=0;

        M = src.nextInt();//colunas
        N = src.nextInt();//linhas

        int[][] matriz= new int[M][N];

        for(int i = 0; i < M; i++) {
            for(int j =0 ; j <N; j++) {
                matriz[i][j] = src.nextInt();
            }
        }
        int filaTroca = src.nextInt() - 1;
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
