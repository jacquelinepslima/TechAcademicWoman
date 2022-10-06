package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double MEDIA = (A*0.2) + (B*0.3) + (C*0.5);

        System.out.printf("MEDIA = %.1f%n", MEDIA);

        scanner.close();
    }
}
