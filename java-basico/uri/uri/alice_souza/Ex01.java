package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex01 {
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
        System.out.println("VALORES NEGATIVOS: ");
        for (int i =0; i<M; i++){
            for(int j = 0; j<N; j++){
                if(matriz[i][j]<0){
                    System.out.println(matriz[i][j]);
                }
            }
        }
        scan.close();
    }
}
