package exercicio.uri.amanda_alves;

import java.util.Locale;
import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        double valorX1 = scanner.nextDouble();
        double valorY1 = scanner.nextDouble();

        double valorX2 = scanner.nextDouble();
        double valorY2 = scanner.nextDouble();

        double distancia = Math.sqrt((Math.pow((valorX2 - valorX1), 2) + (Math.pow((valorY2 - valorY1), 2))));

        System.out.printf("%.4f", distancia);

        scanner.close();
    }
}
