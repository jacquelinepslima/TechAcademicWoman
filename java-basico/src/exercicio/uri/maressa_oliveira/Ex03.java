package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        int maiorNum = 0;
        for(int i = 0; i < n; i++){
            maiorNum = matriz[i][i];
            for(int j = 0; j < n; j++){

                if (matriz[i][j] > maiorNum){
                    maiorNum = matriz[i][j];
                }

            }
            System.out.println(maiorNum);
        }

        sc.close();
    }


}
