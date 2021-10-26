package exercicio.uri.jacque_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double numerosPositivos = 0.0;
        double soma = 0;

        double[][] matriz = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.printf("Numeros positivos: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > 0) {
                    numerosPositivos += matriz[i][j];
                }
            }
        }
        System.out.printf("%.1f", numerosPositivos);

        System.out.printf("%nLinha Escolhida:");
        for (int j = 0; j < n; j++) {
            System.out.printf(" %.1f ", matriz[x][j]);
        }
        System.out.printf("%nColuna Escolhida: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", matriz[i][y]);
        }

        System.out.printf("%nDiagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.printf("%nMatriz Alterada: %n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

            sc.close();
        }
    }