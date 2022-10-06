package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int x = 0;

        int[] negativos = new int[(m*n)];
        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    negativos[x] = matriz[i][j];
                    x++;
                }
            }
        }

        System.out.println("VALORES NEGATIVOS");

        for(int i = 0; i < x; i++) {
            System.out.println(negativos[i]);
        }
    }
}
