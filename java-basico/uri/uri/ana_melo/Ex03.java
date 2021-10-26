package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] matriz = new int[N][N];
        int[] maior = new int[N];

        for(int i = 0; i < N; i++){
            maior[i] = matriz[i][0];
            for(int j = 0; j < N; j ++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > maior[i])
                    maior[i] = matriz[i][j];
            }
        }

        for(int i = 0; i < N; i++)
            System.out.println(maior[i]);
    }
}
