package exercicio.uri.natasha_busnardo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        if (salario <= 2000)
            System.out.println("Isento");
        else if ((salario > 2000) && (salario <= 3000))
            System.out.printf("R$ %.2f", ((salario - 2000) * 0.08));
        else if ((salario > 3000) && (salario <= 4500))
            System.out.printf("R$ %.2f", 1000.0 * 0.08 + (salario - 3000.0) * 0.18);
        else if (salario > 4500)
            System.out.printf("R$ %.2f", 1000.0 * 0.08 + 1500.0 * 0.18 + (salario - 4500.0) * 0.28);
    }
}
