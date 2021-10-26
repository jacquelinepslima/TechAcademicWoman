package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int x = 0;

        int[][] matriz = new int[M][N];
        int[] vetNeg = new int[(M*N)];

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j ++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j]<0) {
                    vetNeg[x] = matriz[i][j];
                    x++;
                }
            }
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for(int i = 0; i < x; i++)
            System.out.println(vetNeg[i]);
    }
}
