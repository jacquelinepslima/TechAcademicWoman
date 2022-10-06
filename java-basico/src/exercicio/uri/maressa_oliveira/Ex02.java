package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, i, j;
        n = sc.nextInt();
        int[][] matriz = new int[n][n];
        int[] soma = new int[n];
        int linhaAtual = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            soma[i]=0;
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                soma[linhaAtual] += matriz[i][j];
                }
            linhaAtual++;
            }
        for (i = 0; i < n; i++) {
            System.out.println(soma[i]);
        }
        sc.close();
    }
}
