package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M, N;

        M = scanner.nextInt(); // Linhas
        N = scanner.nextInt(); // Colunas

        int[][] matriz = new int[M][N];

        // Populando a matriz
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrando os números negativos da matriz
        System.out.println("VALORES NEGATIVOS:");
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                if (matriz[i][j] < 0) System.out.println(matriz[i][j]);
            }
        }

        scanner.close();
    }
}
