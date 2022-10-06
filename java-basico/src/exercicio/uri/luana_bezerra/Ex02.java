package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner exercicio = new Scanner(System.in);

        int N = exercicio.nextInt();
            int[][] matriz = new int[N][N];
        int soma = 0;

        for(int i = 0; i < N; i++){ // por linha
            for(int j = 0; j < N; j++){ // por coluna
                matriz[i][j] = exercicio.nextInt();
            }
        }

        for(int i = 0; i < N; i++){ // por linha
            for(int j = 0; j < N; j++){ // por coluna
                soma += matriz[i][j];
            }
            System.out.println(soma);
            soma = 0;
        }

        exercicio.close();
    }
}
