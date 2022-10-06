package exercicio.uri.ana_caroline;

import java.util.Scanner;

public class Ex1074 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();

            if (x == 0) {
                System.out.println("NULL");

            } else if (x % 2 == 0) {

                if (x > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }

            } else {

                if (x > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }


        }
        sc.close();
    }
}
