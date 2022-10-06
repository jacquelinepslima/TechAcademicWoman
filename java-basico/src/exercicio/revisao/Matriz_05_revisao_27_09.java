package exercicio.revisao;

import java.util.Scanner;

public class Matriz_05_revisao_27_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); // m - linhas
        int y = scanner.nextInt(); // n - colunas

        int[][] a = new int[x][y];
        int[][] b = new int[x][y];
        int[][] somaAeB = new int[x][y];

        // valores matriz A
        System.out.println("valores matriz A: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("valores matriz B: ");

        // valores matriz b
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                b[i][j] = scanner.nextInt();
            }
        }


        // popular a matriz somaAeB com os valores de A + B
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                somaAeB[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("valores somados :");
        // apresenta os valores somando
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(somaAeB[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

}
