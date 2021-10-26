package exercicio.uri.samyra_figueiredo;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, j, gira, temp;

        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][] matriz = new int [m][n];

        for (i = 0; i < m; i++) {
            for(j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        gira = sc.nextInt();
        temp = matriz[gira - 1][n - 1];

        for (j = n - 1; j > 0; j--){
            matriz[gira-1][j] = matriz[gira-1][j-1];
        }

        matriz[gira - 1][0] = temp;

        for (i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                if (j != n - 1){
                    System.out.print("[" + matriz[i][j] + "]" + " ");
                }
                else System.out.println("[" + matriz[i][j] + "]" + " ");
            }
        }

        sc.close();
    }
}
