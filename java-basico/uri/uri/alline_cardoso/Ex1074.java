package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a;
        for (a = 0; a < N; a++) {
            int X = scanner.nextInt();


            if (X < 0) {
                if (X % 2 == 0) {
                    System.out.println("EVEN NEGATIVE ");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            } else if (X > 0) {
                if (X % 2 == 0) {
                    System.out.println(" EVEN POSITIVE");
                } else {
                    System.out.println("ODD POSITIVE");
                }
            } else if (X == 0) {
                System.out.println("NULL");
            }
        }
        scanner.close();
    }
}