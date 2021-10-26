package exercicio.uri.amanda_alves;

import java.io.IOException;
import java.util.Scanner;

public class Ex1001 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int A, B;

        A = scanner.nextInt();
        B = scanner.nextInt();

        int X = A + B;

        System.out.println ("X = " + X);
    }
}
