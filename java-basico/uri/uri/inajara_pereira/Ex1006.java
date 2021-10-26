package exercicio.uri.inajara_pereira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a 1ª nota: ");
        double notaA = sc.nextDouble() * 2;
        System.out.println("Insira a 2ª nota: ");
        double notaB = sc.nextDouble() * 3;
        System.out.println("Insira a 3ª nota: ");
        double notaC = sc.nextDouble() * 5;

        double media = (notaA + notaB + notaC) / 10;

        System.out.printf("MÉDIA = %.1f", media);
        sc.close();
    }
}
