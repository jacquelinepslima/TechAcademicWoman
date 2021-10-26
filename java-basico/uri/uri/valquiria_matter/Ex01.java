package exercicio.uri.valquiria_matter;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] valores = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                valores[j][i] = sc.nextInt();
            }
        }


        System.out.println("VALORES NEGATIVOS: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (valores[i][j] < 0) {
                    System.out.println(valores[i][j]);
                }
            }
        }
        sc.close();
    }

}
