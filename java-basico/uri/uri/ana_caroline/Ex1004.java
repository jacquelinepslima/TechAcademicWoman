package exercicio.uri.ana_caroline;

import java.util.Scanner;

public class Ex1004 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int prod = a * b;

        System.out.println();
        System.out.printf("PROD = %d%n", prod);

        sc.close();
    }
}
