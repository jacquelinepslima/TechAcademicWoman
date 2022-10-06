package exercicio.uri.inajara_pereira;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int matriz[][] = new int[n][n];
        int soma = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                soma += matriz[i][j];
            }
            System.out.println(soma);
            soma = 0;
        }


        scan.close();
    }


}
