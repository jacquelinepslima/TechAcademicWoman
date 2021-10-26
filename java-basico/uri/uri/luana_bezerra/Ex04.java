package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner exercicio = new Scanner(System.in);

        int n = exercicio.nextInt();
        int[][] matriz = new int[n][n];
        int soma = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = exercicio.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j > i){
                    soma += matriz[i][j];
                    }
                }
            }

        System.out.println(soma);

        exercicio.close();
    }
}
