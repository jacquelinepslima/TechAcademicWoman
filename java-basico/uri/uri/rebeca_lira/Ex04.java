package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        int soma = 0;

        int[][] matriz = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println("Soma da diagonal principal = " + soma);

        entrada.close();
    }
}
