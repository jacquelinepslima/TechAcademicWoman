package exercicio.revisao;

import java.util.Scanner;

/*
Algoritmo que leia dois valores x e y e criar uma matriz
com linha x e coluna y e imprimir os valores dos elementos
 */
public class Exercicio_resolvido_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int[][] matriz = new int[x][y];

        System.out.println("Digite os valores da matriz");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("valores digitados");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
