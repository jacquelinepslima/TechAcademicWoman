package exercicio.uri.evelin_ferraz;

import java.util.Scanner;

public class Ex1144 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N, j2 = 1, j3 = 1, aux = 0, count;

        N = scanner.nextInt();

        if ((N > 1) && (N < 1000)){
            for (int i = 1; i <= N; i++) {
                for (int j = 0; j < 2; j++) {
                    if ( j == 0) {
                        j3 = i * j2;
                        System.out.println(i + " " + j2 + " " + j3);
                    } else {
                        j2++;
                        j3++;
                        System.out.println(i + " " + j2 + " " + j3);
                        aux += 2;
                    }
                    if ((i == 1) && (j == 1)){ j2 = 2;}
                }
                j2 += aux;
                System.out.println();
            }
        }

        scanner.close();
    }
}
