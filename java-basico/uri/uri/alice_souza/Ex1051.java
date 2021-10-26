package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, imposto;

        salario = sc.nextDouble();

        if ( salario > 2000.00 && salario <= 3000.00) {
            imposto = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else if ( salario > 3000 && salario <= 4500) {
            imposto = (1000 * 0.08) + ((salario - 3000) * 0.18);
            System.out.printf("R$ %.2f%n", imposto);
        } else if ( salario > 4500) {
            imposto = (1000 * 0.08) + (1500 * 0.18) + ((salario - 4500) * 0.28);
            System.out.printf("R$ %.2f%n", imposto);
        } else if ( salario >= 0.00 && salario <= 2000.00) {
            System.out.println("Isento");
        }

        sc.close();
    }
}
