package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];

        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        int fila = sc.nextInt() - 1;

        int ultimoSoldado = matriz[fila][n-1];

        for(int i = n-1; i > 0; i--){
            matriz[fila][i] = matriz[fila][i-1];
        }

        matriz[fila][0] = ultimoSoldado;

        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
