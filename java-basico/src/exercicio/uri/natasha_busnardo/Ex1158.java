package exercicio.uri.natasha_busnardo;

import java.util.Scanner;

public class Ex1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            while (y != 0) {
                if (x % 2 != 0) {
                    soma += x;
                    y--;
                    x++;
                } else {
                    x++;
                }
            }
            System.out.println(soma);
            soma = 0;
        }
    }
}
