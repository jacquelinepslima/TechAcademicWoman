package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] matriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        //somando os elementos da matriz:
        System.out.println("Soma dos Elementos:");
        int soma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz [i][j] > 0){
                    soma +=matriz[i][j];
                }
            }
        }
        System.out.println(soma);
        System.out.println();

        //imprimir linha:


        // imprimir coluna:



        // elementos da diagonal:
        System.out.println("Elementos da diagonal principal");
        for (int i = 0; i < N; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();


        scanner.close();
    }
}
