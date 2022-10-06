package exercicio.revisao;

import java.util.Locale;
import java.util.Scanner;

public class Matriz_06_revisao_27_09 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // matriz quadrada
        int x = scanner.nextInt(); // X e Y

        double[][] matriz = new double[x][x];

        // entrando os valores da matriz
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                matriz[i][j] = scanner.nextDouble();

            }
        }

        // calculo e impressao da soma dos valores positivos
        double soma = 0.0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (matriz[i][j] > 0.0) {
                    soma += matriz[i][j];
                }
            }
        }
        System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);


        int linhaEscolhida = scanner.nextInt();
        System.out.print("LINHA ESCOLHIDA: ");
        for (int i = 0; i < x; i++) {
            System.out.printf("%.1f ", matriz[linhaEscolhida][i]);
        }

        int colunaEscolhida = scanner.nextInt();
        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < x; i++) {
            System.out.printf("%.1f ", matriz[i][colunaEscolhida]);
        }
        System.out.println();
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < x; i++) {
            System.out.printf("%.1f ", matriz[i][i]);
        }

        System.out.println();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (matriz[i][j] < 0.0) {
                    // matriz[i][i] = matriz[i][i] * matriz[i][i];
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
            }
        }

        System.out.println("MATRIZ ALTERADA: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.printf("%.1f ", matriz[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
