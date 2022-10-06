package exercicio.uri.amanda_alves;

import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int in = 0;
        int out = 0;

        for (int y = 0; y < N; y++) {
            int X = scanner.nextInt();
            if (X >= 10 && X <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in.");
        System.out.println(out + " out.");

        scanner.close();
    }
}
