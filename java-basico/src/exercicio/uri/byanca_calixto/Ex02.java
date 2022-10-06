package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int soma = 0;

        int[][] matriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j < N)
                    soma += matriz[i][j];
            }
            System.out.println(soma);
            soma = 0;
        }
        sc.close();
    }
}
