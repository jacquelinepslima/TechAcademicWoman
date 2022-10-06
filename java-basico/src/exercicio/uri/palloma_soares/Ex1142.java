package exercicio.uri.palloma_soares;

import java.util.Scanner;

public class Ex1142 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] matriz = new int[N][4];
        int contador = 0;

        for (int i = 0; i <=N; i++){ //linha
            for (int j = 1; j<=4; j++){//coluna
                if (j%4==0){
                    System.out.print("PUM" + " ");
                } else {
                    matriz[i][j] = contador+1;
                    System.out.print(matriz[i][j] + " ");
                }contador+=1;

            }
            System.out.println();
        }
        sc.close();
    }
}