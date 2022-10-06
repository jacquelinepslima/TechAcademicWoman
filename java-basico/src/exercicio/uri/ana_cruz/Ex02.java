package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] matriz = new int[N][N];
        int[] soma = new int[N];

        for(int i = 0; i < N; i++){
            soma[i] = 0;
            for(int j = 0; j < N; j ++) {
                matriz[i][j] = scanner.nextInt();
                soma[i] += matriz[i][j];
            }
        }

        for(int i = 0; i < N; i++)
            System.out.println(soma[i]);
    }
}
