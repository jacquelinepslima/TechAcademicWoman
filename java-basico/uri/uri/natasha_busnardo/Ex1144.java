package exercicio.uri.natasha_busnardo;

import java.util.Scanner;

public class Ex1144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.printf("%d", i);
            System.out.printf(" %d", i * i);
            System.out.printf(" %d%n", i * i * i);
            System.out.printf("%d", i);
            System.out.printf(" %d", (i * i) + 1);
            System.out.printf(" %d%n", (i * i * i) + 1);

        }
    }
}