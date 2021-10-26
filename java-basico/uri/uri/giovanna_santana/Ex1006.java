package exercicio.uri.giovanna.santana;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, media;
        double pesoA=2, pesoB=3, pesoC=5, pesoSoma;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        pesoSoma = pesoA+pesoB+pesoC;

        media = ((A*pesoA)+(B*pesoB)+(C*pesoC))/pesoSoma;

        System.out.printf("MEDIA = %.1f%n", media);
        sc.close();
    }
}
