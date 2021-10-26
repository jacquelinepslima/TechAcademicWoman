package exercicio.uri.amanda_alves;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soma = 0;

        int [][] matriz = new int [n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                soma = matriz [j][i] + soma;
            }
            System.out.println(soma);
            soma = 0;
        }
        sc.close();
    }
}
