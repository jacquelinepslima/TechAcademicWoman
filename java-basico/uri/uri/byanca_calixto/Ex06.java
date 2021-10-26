package exercicio.uri.byanca_calixto;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[][] matrizN = new double[N][N];

        for (int i = 0; i < N; i++) { // linha
            for (int j = 0; j < N; j++) { //coluna
                matrizN[i][j] = sc.nextInt();
            }
        }

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        double positivos = 0;
        for (int i = 0; i < N; i++) { // linha
            for (int j = 0; j < N; j++) { //coluna
                if (matrizN[i][j] > 0) {
                    positivos += matrizN[i][j];
                }
            }
        }
        System.out.println("SOMA DOS POSITIVOS: " + positivos);

        System.out.printf("%nLINHA ESCOLHIDA:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (linha == i) {
                    System.out.print(matrizN[i][j] + " ");
                }
            }
        }
        System.out.println(" ");


        System.out.printf("%nCOLUNA ESCOLHIDA:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (coluna == j) {
                    System.out.print(matrizN[i][j] + " ");
                }
            }
        }
        System.out.println(" ");

        System.out.printf("%nDIAGONAL PRINCIPAL: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    System.out.print(matrizN[i][j] + " ");
                }
            }
        }
        System.out.println(" ");


        System.out.println("MATRIZ ALTERADA: ");
        for (int i = 0; i < N; i++) { // linha
            for (int j = 0; j < N; j++) { //coluna
                if (matrizN[i][j] < 0) {
                    System.out.print(matrizN[i][j] * matrizN[i][j] + " ");
                } else {
                    System.out.print(matrizN[i][j] + " ");
                }
            }
            System.out.println(" ");
        }
        sc.close();
    }
}