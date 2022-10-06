package exercicio.uri.alline_cardoso;

import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        double raio;
        raio = scan.nextDouble();

        double volume = (double)4 / 3 * 3.14159 * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        scan.close();
    }
}
