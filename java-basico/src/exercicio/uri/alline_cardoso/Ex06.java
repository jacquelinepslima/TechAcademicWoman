package exercicio.uri.alline_cardoso;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, i, j, linha, coluna;
        double positivos = 0;

        n = sc.nextInt();

        double[][] matriz = new double[n][n];
        double[][] matrizAlt = new double[n][n];

        // LENDO VALORES DA MATRIZ
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        // SOMA DOS POSITIVOS
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (matriz[i][j] > 0) {
                    positivos += matriz[i][j];
                }
            }
        }

        linha = sc.nextInt();
        coluna = sc.nextInt();

        System.out.println("SOMA DOS POSITIVOS: " + positivos);

        // LINHA ESCOLHIDA
        System.out.print("LINHA ESCOLHIDA: ");
        for (i = linha; i == linha; i ++) {
            for (j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]" + " ");
            }
        }

        System.out.println();

        // COLUNA ESCOLHIDA
        System.out.print("COLUNA ESCOLHIDA: ");
        for (i = 0; i < n; i ++) {
            for (j = coluna; j == coluna; j++) {
                System.out.print("[" + matriz[i][j] + "]" + " ");
            }
        }

        System.out.println();

        // DIAGONAL PRINCIPAL
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (i = 0; i < n; i++){
            System.out.print("[" + matriz[i][i] + "]" + " ");
        }

        System.out.println();

        // MATRIZ ALTERADA
        System.out.println("MATRIZ ALTERADA: ");

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    matrizAlt[i][j] = matriz[i][j] * matriz[i][j];
                } else {
                    matrizAlt[i][j] = matriz[i][j];
                }
                System.out.print("[" + matrizAlt[i][j] + "]" + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
