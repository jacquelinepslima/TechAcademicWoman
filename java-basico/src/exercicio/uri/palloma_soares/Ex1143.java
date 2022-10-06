package exercicio.uri.palloma_soares;

import java.util.Scanner;

public class Ex1143 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] matriz = new int[N][4];
        int [][] matrizNova = new int[N][4];
        int contador = 1, total = 0, calculo = 0;

        for (int i = 0; i <N; i++){ //linha
            for (int j = 1; j<=4; j++){//coluna
                // nao ta imprimindo com o calculo ainda!!!
                if (j%4==0){
                    System.out.print(" ");
                } else {
                     calculo = (contador*i+1);
                     matriz[i][j] = calculo;
                     System.out.print(matriz[i][j] + " ");
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
