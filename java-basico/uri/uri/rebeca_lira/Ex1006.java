package exercicio.uri.rebeca_lira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A, B, C;
        double notaA, notaB, notaC;
        double media;

        System.out.println("Quais são as 3 notas?");
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        notaA = A * 2;
        notaB = B * 3;
        notaC = C * 5;
        media = (notaA + notaB + notaC)/10;

        System.out.printf("MÉDIA %.1f", media);

        scanner.close();
    }
}
