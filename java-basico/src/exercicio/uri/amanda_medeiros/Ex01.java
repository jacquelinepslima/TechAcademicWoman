package exercicio.uri.amanda_medeiros;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int[][]matriz = new int[M][N];


        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                if (matriz[i][j] < 0){
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}
