package exercicio.uri.evelin_ferraz;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //setando o tamanho da matriz
        int N = scanner.nextInt();
        int[][] matriz = new int[N][N];
        int somaDiagonal = 0;
        // preenchendo os elementos da matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //Enquanto o J for maior que I, ele vai somar ou seja 3 + 2 + 7;
                if(j > i){
                    somaDiagonal += matriz[i][j];
                }
            }
        }
        System.out.print(somaDiagonal);
        System.out.println();
        scanner.close();
    }
}
