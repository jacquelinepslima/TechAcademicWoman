package exercicio.uri.amanda_medeiros;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int tempo = scanner.nextInt();
        int velocidade = scanner.nextInt();

        double distancia = velocidade * tempo;
        double litrosNecessarios = distancia / 12;

        System.out.printf("%.3f",litrosNecessarios);
        scanner.close();
    }
}
