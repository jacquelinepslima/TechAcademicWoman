package exercicio.uri.giovanna_santana;

import java.util.Locale;
import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();

        double b1 = sc.nextDouble();
        double b2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(b1 - a1,2) + Math.pow(b2 - a2,2));

        System.out.printf("%.4f", distancia);

        sc.close();
    }
}
