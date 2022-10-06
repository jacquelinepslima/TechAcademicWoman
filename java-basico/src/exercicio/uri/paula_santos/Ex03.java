package exercicio.uri.paula_santos;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maior = 0;
        int n = sc.nextInt();

        int [][]matriz = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            maior=0;
            for(int j = 0; j < n; j++){
                if(matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println(maior);
        }
        sc.close();
    }
}
