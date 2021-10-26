package exercicio.uri.palloma_soares;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();

        double consumoMedio = X/Y;

        System.out.printf("%.3f km/l%n", consumoMedio);

        sc.close();
    }
}
