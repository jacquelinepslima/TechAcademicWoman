package exercicio.uri.evelin_ferraz;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] matriz = new int[N][N];
        int soma = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                soma = soma + matriz[i][j];
            }
            System.out.println(soma);
            soma = 0;
        }
        scanner.close();
    }
}
