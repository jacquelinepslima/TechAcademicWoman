package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maior = 0;

        int[][] matriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == 0)
                    maior = matriz[i][j];
                else if(matriz[i][j] > maior)
                    maior = matriz[i][j];
            }
            System.out.println(maior);
            maior = 0;
        }
        sc.close();
    }
}
