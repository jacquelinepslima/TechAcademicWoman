package exercicio.uri.amanda_alves;

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();

        double media = (notaA * 3.5 + notaB * 7.5)/11;

        System.out.printf("MEDIA = %.5f \n", media);
    }
}
