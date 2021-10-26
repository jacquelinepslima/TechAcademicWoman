package exercicio.uri.rebeca_lira;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        double[][] matriz = new double[n][n];
        double positivos = 0;
        double[][] matrizQuadrada = new double[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matriz[i][j] = entrada.nextDouble();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(matriz[i][j] >= 0)
                    positivos += matriz[i][j];
            }
        }
        System.out.println("SOMA DOS POSITIVOS: " + positivos);

        int indiceLinha = entrada.nextInt();

        System.out.print("LINHA ESCOLHIDA: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == indiceLinha)
                    System.out.print(matriz[i][j] + " ");
            }
        }

        int indiceColuna = entrada.nextInt();

        System.out.print("COLUNA ESCOLHIDA: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == indiceColuna)
                    System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.print("DIAGONAL PRINCIPAL: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j)
                    System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();

        System.out.println("MATRIZ ALTERADA: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]*matriz[i][j] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}
