package exercicio.uri.isabel_oliveira;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int matriz [][] = new int [N][N];
        for (int i =0; i<N; i++){
            for (int j = 0; j<N ; j++){
                matriz[i][j] = scan.nextInt();
            }
        }
        for (int i =0; i<N; i++){
            int maior = 0;
            for (int j = 0; j<N ; j++){
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
            System.out.println(maior);
        }

        scan.close();
    }
}
