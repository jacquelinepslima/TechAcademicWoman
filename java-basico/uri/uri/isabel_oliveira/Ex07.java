package exercicio.uri.isabel_oliveira;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();

        int [][] matriz = new int [M][N];

        for (int i =0; i<M; i++){
            for(int j = 0; j<N; j++){
                matriz[i][j] = scan.nextInt();
            }
        }
        int gira = scan.nextInt();
        int temp = matriz[gira-1][N-1];

        for (int j=N-1; j>0; j--){
            matriz[gira-1][j] = matriz[gira-1][j-1];
        }
        matriz[gira-1][0] = temp;

        for (int i =0; i<M; i++){
            for(int j = 0; j<N; j++){
                if (j!=N-1){
                    System.out.print(matriz[i][j] + " ");
                }
                else System.out.println(matriz[i][j] );
            }
        }
        scan.close();
    }
}
