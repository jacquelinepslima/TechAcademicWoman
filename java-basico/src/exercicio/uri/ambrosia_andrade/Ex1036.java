package exercicio.uri.ambrosia_andrade;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A, B, C, raiz;

        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        double delta = Math.pow(B, 2) - 4.0 * A * C;

        if(A == 0 || delta < 0.0) {
            System.out.println("Impossível calcular");
        } else {
            double r1 = (-B + Math.sqrt(delta) / (2.0 * A));
            double r2 = (-B - Math.sqrt(delta) / (2.0 * A));
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }

        scanner.close();
    }
}
