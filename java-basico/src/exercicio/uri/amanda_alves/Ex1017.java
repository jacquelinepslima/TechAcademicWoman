package exercicio.uri.amanda_alves;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int tempoGasto = scanner.nextInt();;
        int velocidadeMedia = scanner.nextInt();

        double distancia = tempoGasto * velocidadeMedia;
        double litrosNecessarios = distancia / 12;

        System.out.printf("%.3f \n", litrosNecessarios);
        scanner.close();
    }
}
