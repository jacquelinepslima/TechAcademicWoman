package exercicio.uri.inajara_pereira;

import java.util.Scanner;

public class Ex1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if (x > 0) {
                if (x % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("ODD POSITIVE");
                }
            } else if (x < 0) {
                if (x % 2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            } else {
                System.out.println("NULL");
            }
        }
        sc.close();
    }
}
