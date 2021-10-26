package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int a = 0; a < N; a++) {
            int contador = 0;
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            for (int b = 0; b < Y; X++)
                if (X % 2 != 0) {
                    contador = contador + X;
                    b++;
                }
            System.out.println(contador);
        }
        scanner.close();
    }
}

