package exercicio.uri.samyra_figueiredo;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[][] matriz = new int[N][N];
        int soma = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                soma += matriz[i][j];
            }
            System.out.println(soma);
            soma = 0;
        }
        scan.close();
    }
}