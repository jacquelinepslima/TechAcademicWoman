package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        System.out.printf("MEDIA = %.1f", (A*2 + B*3 + C*5)/10);

        sc.close();
    }
}
