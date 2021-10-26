package exercicio.uri.evelin_ferraz;

import java.util.Scanner;

public class Ex1153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N, calc = 1;

        N = scanner.nextInt();

        for (int i = N; i > 0; i--) {
            calc *= i;
        }

        System.out.println(calc);

        scanner.close();
    }
}
