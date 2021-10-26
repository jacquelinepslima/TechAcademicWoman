package exercicio.uri.ana_caroline;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];


        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

       int soma = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++ )
                if (i < j){
                    soma += matriz[i][j];
                }

        }

        System.out.println(soma);

        sc.close();

    }
}
