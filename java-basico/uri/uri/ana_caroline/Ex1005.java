package exercicio.uri.ana_caroline;

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        double media = (a * 3.5 + b * 7.5) / 11;

        System.out.printf("MEDIA = %.5f", media);
        sc.close();
    }
}
