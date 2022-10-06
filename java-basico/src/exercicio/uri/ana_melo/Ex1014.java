package exercicio.uri.ana_melo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();
        double totalGasto = sc.nextDouble();

        double consumoMedio = distancia / totalGasto;

        System.out.printf("%.3f km/l", consumoMedio);

        sc.close();

    }
}
