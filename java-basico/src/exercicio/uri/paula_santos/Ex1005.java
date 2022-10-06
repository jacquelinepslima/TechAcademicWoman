package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double notaA = (A*3.5);
        double notaB = (B*7.5);

        double Media = (notaA+notaB)/11;

        System.out.printf("MEDIA = %.5f %n", Media);
        scanner.close();
    }
}
