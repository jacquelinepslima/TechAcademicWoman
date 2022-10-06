package exercicio.uri.amanda_medeiros;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int distancia = scanner.nextInt();
        double combustivel = scanner.nextDouble();
        double resultado = distancia / combustivel;

        System.out.printf("%.3f km/l", resultado);

        scanner.close();
    }
}
