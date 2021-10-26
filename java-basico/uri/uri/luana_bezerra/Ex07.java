package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int[][] matriz = new int[M][N];

        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Número da fila que haverá a troca
        int fila = scanner.nextInt() - 1;
        int[] tempLinha = new int[N];

        // Atribuindo os valores da fileira escolhida na tempLinha
        for (int i = 1; i < N; i++){
            // Primeiro valor é o último da fila
            tempLinha[0] = matriz[fila][N - 1];
            tempLinha[i] = matriz[fila][i - 1];
        }

        // Atribuir o valor da linha trocada na matriz
        for (int i = 0; i < N; i++){
            matriz[fila][i] = tempLinha[i];
        }
        
        // Mostrar a matriz finalizada
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
