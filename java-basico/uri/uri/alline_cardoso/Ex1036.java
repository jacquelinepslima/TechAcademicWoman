package exercicio.uri.alline_cardoso;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double A, B, C, delta, x1, x2;

        System.out.println("Digite um valor para A:");
        A = scan.nextDouble();

        System.out.println("\n Digite um valor para B:");
        B = scan.nextDouble();

        System.out.println("\n Digite um valor para C:");
        C = scan.nextDouble();

        delta = Math.pow(B, 2) - 4 * A * C;

        if (delta > 0) {
            x1 = (double) ((-B + Math.sqrt(delta)) / (2 * A));

            x2 = (double) ((-B - Math.sqrt(delta)) / (2 * A));

            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);

        } else {
            System.out.println("Impossível calcular");
        }
        scan.close();
    }
}
