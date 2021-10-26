package exercicio.uri.amanda_medeiros;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double nota1 = a * 2 / 10;
        double nota2 = b * 3 / 10;
        double nota3 = c * 5 / 10;

        double resultado = (nota1 + nota2 + nota3);

        System.out.printf("MEDIA = %.1f", resultado);


        scanner.close();
    }
}
