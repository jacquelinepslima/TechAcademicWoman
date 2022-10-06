package exercicio.uri.alline_cardoso;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner md = new Scanner(System.in);

        double A = md.nextDouble();
        double B = md.nextDouble();
        double C = md.nextDouble();

        double media = ((A * 2) + (B * 3) + (B * 5)) / 10;

        System.out.printf("MEDIA = %.1f", media);
        System.out.println();


        md.close();
    }
}
