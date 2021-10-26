package exercicio.uri.alline_cardoso;

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner md = new Scanner(System.in);

        double A = md.nextDouble();
        double B = md.nextDouble();

        double media = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f", media);
        System.out.println();

        md.close();
    }
}
