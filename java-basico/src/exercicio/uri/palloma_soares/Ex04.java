package exercicio.uri.palloma_soares;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matriz = new int[N][N];
        int soma=0; //soma1=0;

        for(int i=0; i<N; i++){
            for(int j=0; j<N;j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                    soma += matriz[i][j];
            }
        }
        System.out.println(soma);

       /* for(int i=N-1; i<=0; i++){
            for (int j=i+1; j<=0; j++){
                soma1 += matriz[i][j];
            }
        }

        System.out.println(soma1);*/

        sc.close();
    }
}