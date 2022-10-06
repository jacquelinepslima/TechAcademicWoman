package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] matriz = new int[N][N];
        int soma = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j ++) {
                matriz[i][j] = scanner.nextInt();
                if (j>i)
                    soma += matriz[i][j];
            }
        }

        System.out.println(soma);
    }
}
