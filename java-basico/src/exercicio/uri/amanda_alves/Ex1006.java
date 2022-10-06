package exercicio.uri.amanda_alves;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();
        double notaC = scanner.nextDouble();

        double media = (notaA * 2 + notaB * 3 + notaC * 5)/10;

        System.out.printf("MEDIA = %.1f \n", media);
    }
}
