package exercicio.uri.ana_cruz;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int tempoHoras = scanner.nextInt();
        int velocMedia = scanner.nextInt();

        double distancia = velocMedia*tempoHoras;
        double combustGasto = distancia/12;

        System.out.printf("%.3f", combustGasto);

        scanner.close();
    }
}
