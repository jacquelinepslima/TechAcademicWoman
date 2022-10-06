package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        scanner.close();
        double area = Math.PI * Math.pow(raio,2);
        System.out.printf("A= %.4f%n", area);
    }
}
