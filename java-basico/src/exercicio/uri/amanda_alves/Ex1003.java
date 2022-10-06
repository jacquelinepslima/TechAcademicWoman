package exercicio.uri.amanda_alves;

import java.io.IOException;
import java.util.Scanner;

public class Ex1003 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int A, B;

        A = scanner.nextInt();
        B = scanner.nextInt();

        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    }
}
