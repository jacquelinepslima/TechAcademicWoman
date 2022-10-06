package exercicio.uri.inajara_pereira;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double matriz[][] = new double[n][n];
        double novaMatriz[][] = new double[n][n];

        double soma = 0;
        int linhaEscolhida;
        int colunaEscolhida;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scan.nextDouble();
            }
        }

        linhaEscolhida = scan.nextInt();
        colunaEscolhida = scan.nextInt();
        String linha = "";


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (matriz[i][j] > 0) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("SOMA DOS POSITIVOS: " + soma);

        System.out.print("LINHA ESCOLHIDA: ");
        for (int j = 0; j < n; j++) {
            System.out.print(matriz[linhaEscolhida][j] + " ");
        }

        System.out.println();

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][colunaEscolhida] + " ");
        }

        System.out.println();

        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();

        System.out.print("MATRIZ ALTERADA: ");

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (matriz[i][j] < 0) {
                    novaMatriz[i][j] = matriz[i][j] * matriz[i][j];
                } else {
                    novaMatriz[i][j] = matriz[i][j];
                }

                System.out.print(novaMatriz[i][j] + " ");
            }
            System.out.println("");
        }


        scan.close();

    }


}

