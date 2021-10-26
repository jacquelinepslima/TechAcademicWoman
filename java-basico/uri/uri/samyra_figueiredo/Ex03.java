package exercicio.uri.samyra_figueiredo;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] matriz = new int[N][N];
        int[] maior = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] > maior[i]) {
                    maior[i] = matriz[i][j];
                }
            }
            System.out.println(maior[i]);
        }
        scan.close();
    }
}
