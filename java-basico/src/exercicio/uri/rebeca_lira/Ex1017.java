package exercicio.uri.rebeca_lira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int tempo, velMedia;
        double litros, dist;

        System.out.println("Qual o tempo gasto na viagem?");
        tempo = scanner.nextInt();

        System.out.println("Qual a velocidade média em?");
        velMedia = scanner.nextInt();

        dist = tempo * velMedia;
        litros = dist/12;

        System.out.printf("%.3f", litros);

        scanner.close();
    }
}
