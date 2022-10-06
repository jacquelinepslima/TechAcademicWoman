package exercicio.uri.ana_caroline;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m=0,n=0,i=0,j=0;

        m= scanner.nextInt();
        n= scanner.nextInt();
        int[][] matriz1= new int[m][n];
        int[][] matriz2= new int[m][n];
        int[][] matriznova = new int[m][n];

        for (i = 0; i <m; i++){
            for (j = 0; j < n; j++){
                matriz1[i][j] = scanner.nextInt();
            }
        }
        for (i = 0; i <m; i++){
            for (j = 0; j < n; j++){
                matriz2[i][j] = scanner.nextInt();
            }
        }
        for (i = 0; i <m; i++){
            for (j = 0; j < n; j++){
                matriznova[i][j] = matriz1[i][j]+matriz2[i][j];
            }
        }

        for (i = 0; i <m; i++){
            for (j = 0; j < n; j++){
                System.out.print(matriznova[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
