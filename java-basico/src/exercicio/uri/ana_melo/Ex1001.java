package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B;

        A = scanner.nextInt();
        B = scanner.nextInt();

        int X = A + B;

        System.out.println("X = " + X);

        scanner.close();
    }
}
