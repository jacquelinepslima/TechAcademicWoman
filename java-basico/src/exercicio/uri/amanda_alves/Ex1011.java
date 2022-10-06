package exercicio.uri.amanda_alves;

import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double raio = scanner.nextDouble();
        double pi = 3.14159;

        double volume = (4.0/3) * pi * (raio * raio * raio);

        System.out.printf("VOLUME = %.3f", volume);

    }
}
