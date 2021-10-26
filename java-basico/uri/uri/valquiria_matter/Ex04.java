package exercicio.uri.valquiria_matter;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int matriz[][] = new int[n][n];
        int soma = 0;
        int contador =1;

        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matriz[i][j] = scan.nextInt();
            }
        }

        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                soma = matriz[0][1] + matriz[0][2] + matriz[1][2];

            }
        }

        System.out.print(soma);
        scan.close();

    }

    }


