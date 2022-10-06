package exercicio.uri.amanda_medeiros;

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();

        double resultado1 = (nota1 * 3.5) / 11;
        double resultado2 = (nota2 * 7.5) / 11;
        double total = (resultado1 + resultado2);

        System.out.printf("MEDIA = %.5f", total);



        scanner.close();
    }
}
