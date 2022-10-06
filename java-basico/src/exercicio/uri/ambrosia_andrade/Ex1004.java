package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {

        int A, B, PROD;

        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        B = scanner.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);

        scanner.close();
    }
}
