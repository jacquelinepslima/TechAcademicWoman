package exercicio.uri.alline_cardoso;

import javax.swing.*;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println("VALORES NEGATIVOS: ");
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) System.out.println(matriz[i][j]);
            }
        }
        scan.close();
    }
}
