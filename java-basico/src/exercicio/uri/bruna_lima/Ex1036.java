package exercicio.uri.bruna_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double delta, r1, r2;

        if(a == 0) {
            System.out.println("Impossivel calcular");
            System.exit(0);
        }
        else {
            delta = Math.pow(b, 2) - (4 * a * c);

            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);

            if (delta < 0) {
                System.out.println("Impossivel calcular.");
                System.exit(0);
            }
            else {
                System.out.printf("R1 = %.5f%n", r1);
                System.out.printf("R2 = %.5f%n", r2);
            }
        }

        entrada.close();
    }
}
