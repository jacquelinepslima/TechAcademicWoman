package exercicio.uri.ana_cruz;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        double consumo = scanner.nextDouble();

        double consumoMed = distancia/consumo;

        System.out.printf("%.3f Km/l %n", consumoMed);

        scanner.close();
    }
}
