package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int distancia = scanner.nextInt();
        double combustivel = scanner.nextDouble();

        double consumo = distancia/combustivel;

        System.out.printf("%.3f km/l %n", consumo);

        scanner.close();
    }
}
