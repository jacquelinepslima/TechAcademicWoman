package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex1044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B;

        A = scanner.nextInt();
        B = scanner.nextInt();

        if ( B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        scanner.close();
    }
}
