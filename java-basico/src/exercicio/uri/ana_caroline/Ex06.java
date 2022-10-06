package exercicio.uri.ana_caroline;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[][] matriz = new double[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextDouble();
            }
        }

        double somaPos = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                if(matriz[i][j] > 0){
                    somaPos += matriz[i][j];
                }
            }
        }
        int indiceL = sc.nextInt();
        int indiceC = sc.nextInt();

        System.out.printf("SOMA DOS POSITIVOS: %.1f %n", somaPos);
        System.out.print("LINHA ESCOLHIDA: ");

        for(int j = 0; j < n; j++){
            System.out.printf("%.1f ", matriz[indiceL][j]);

        }
        System.out.println();

        System.out.print("COLUNA ESCOLHIDA: ");

        for(int i = 0; i < n; i++){
            System.out.printf("%.1f ", matriz[i][indiceC]);
        }
        System.out.println();

        System.out.print("DIAGONAL PRINCIPAL: ");

        for(int i = 0; i < n; i++){
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        System.out.println("MATRIZ ALTERADA: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                if(matriz[i][j] < 0){
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println();
        }





        sc.close();
    }
}
