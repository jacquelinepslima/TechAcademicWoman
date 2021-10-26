package exercicio.uri.jacque_lima;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Mcolunas = scanner.nextInt();
        int Nlinhas = scanner.nextInt();

        int[][] matriz = new int[Mcolunas][Nlinhas];

        for (int i = 0; i < Mcolunas; i++) {
            for (int j = 0; j < Nlinhas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("VALORES NEGATIVOS:");

        for (int i = 0; i < Mcolunas; i++) {
            for (int j = 0; j < Nlinhas; j++) {
                if (matriz[i][j] < 0) {
                    System.out.println(matriz[i][j]);
                }
            }

        }
    }
}
