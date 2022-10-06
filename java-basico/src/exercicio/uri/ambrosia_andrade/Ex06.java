package exercicio.uri.ambrosia_andrade;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner exercicio = new Scanner(System.in);

        int n = exercicio.nextInt();
        double[][] matriz = new double[n][n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = exercicio.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > 0) {
                    soma += matriz[i][j];
                }
            }
        }

        int indice = exercicio.nextInt();
        int coluna = exercicio.nextInt();

        System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);

        System.out.print("LINHA ESCOLHIDA:");
        for (int i = 0; i < n; i++) {
            System.out.printf(" %.1f", matriz[indice][i]);
        }

        System.out.println();
        System.out.print("COLUNA ESCOLHIDA:");
        for (int i = 0; i < n; i++) {
            System.out.printf(" %.1f", matriz[i][coluna]);
        }

        System.out.println();
        System.out.print("DIAGONAL PRINCIPAL:");
        for (int i = 0; i < n; i++) {
            System.out.printf(" %.1f", matriz[i][i]);
        }

        System.out.println();
        System.out.println("MATRIZ ALTERADA:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = matriz[i][j] * matriz[i][j];
                }
                System.out.printf("%.1f ", matriz[i][j]);
            }
            System.out.println();
        }

        exercicio.close();
    }
}