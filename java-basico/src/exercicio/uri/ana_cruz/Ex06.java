package exercicio.uri.ana_cruz;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[][] matriz = new double[n][n];
        double[][] matrizElev = new double[n][n];
        double somaPositivo = 0;
        int indiceLinha, indiceColuna;

        //Leitura da matriz
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matriz[i][j] = sc.nextDouble();
            }
        }

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (matriz[i][j] > 0){
                    somaPositivo += matriz[i][j];
                }
            }
        }

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (matriz[i][j] < 0){
                    matrizElev[i][j] = Math.pow(matriz[i][j],2);
                } else{
                    matrizElev[i][j] = matriz[i][j];
                }
            }
        }

        indiceLinha = sc.nextInt();
        indiceColuna = sc.nextInt();


        // Impressao dos numeros
        System.out.printf("SOMA DOS POSITIVOS: %.1f%n", somaPositivo);

        System.out.print("LINHA ESCOLHIDA: ");
        for(int i = 0; i < n; i++){
            System.out.print(matriz[indiceLinha][i] + " ");
        }
        System.out.println();

        System.out.print("COLUNA ESCOLHIDA: ");
        for(int i = 0; i < n; i++){
            System.out.print(matriz[i][indiceColuna] + " ");
        }
        System.out.println();

        System.out.print("DIAGONAL PRINCIPAL: ");
        for(int i = 0; i < n; i++){
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        System.out.println("MATRIZ ALTERADA: ");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrizElev[i][j] + " ");;
            }
            System.out.println();
        }

        sc.close();
    }
}
