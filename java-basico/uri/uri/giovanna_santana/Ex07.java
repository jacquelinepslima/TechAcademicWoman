package exercicio.uri.giovanna_santana;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int [][] matriz = new int[M][N];
        for (int i = 1; i <= M; i++){
            for (int j = 1; j <= N; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        int girarFila = sc.nextInt();
        int aux;
        for (int i = 1; i <= M; i++){
            for (int j = 1; j <= N; j++){
                if(i == girarFila){
                    aux = matriz[i][j];
                    matriz[i][1] = matriz[i][5];
                    matriz[i][5] = matriz[i][4];
                    matriz[i][4] = matriz[i][3];
                    matriz[i][3] = matriz[i][2];
                    matriz[i][2] = aux;
                    System.out.println(matriz[i][j]);
                }
            }
        }


        sc.close();
    }
}
