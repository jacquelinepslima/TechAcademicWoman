package exercicio.uri.ana_cruz;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = Math.pow(b,2) - 4*a*c;

        double r1, r2;

        if(delta<0 || a == 0)
            System.out.println("Impossivel calcular");
        else {
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f %nR2 = %.5f",  r1, r2);
        }

        scanner.close();
    }

}
