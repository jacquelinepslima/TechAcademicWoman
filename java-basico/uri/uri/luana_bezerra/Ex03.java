package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] maiorDaLinha = new int[N];
        int[][] matriz = new int[N][N];

        // Populando a matriz
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                matriz[i][j] = scanner.nextInt();
                // Verificando qual o maior elemento da linha
                if (matriz[i][j] > maiorDaLinha[i]) maiorDaLinha[i] = matriz[i][j];
            }
        }

        // Mostrando o maior elemento da linha
        for (int i = 0; i < N; i++){
            System.out.println(maiorDaLinha[i]);
        }

        scanner.close();
    }
}
