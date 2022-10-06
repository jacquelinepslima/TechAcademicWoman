package exercicio.uri.ana_cruz;

import java.util.Locale;
import java.util.Scanner;

public class Ex1003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        scanner.close();
    }
}
