package exercicio.uri.ana_cruz;

import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double raio;

        System.out.println("Digite o valor do raio (com duas casas decimais)");
        raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio,2);

        System.out.printf("A=%.4f%n", area);

        scanner.close();
    }

}
