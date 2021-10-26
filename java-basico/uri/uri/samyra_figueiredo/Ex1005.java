package exercicio.uri.samyra_figueiredo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        double a, b, media;

        a = sc.nextDouble();
        b = sc.nextDouble();

        media = ((a * 3.5) + (b * 7.5))/11;

        System.out.println(String.format("MEDIA = %.5f", media));

        sc.close();
    }
}
