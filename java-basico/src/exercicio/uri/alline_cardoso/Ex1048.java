package exercicio.uri.alline_cardoso;

import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double salario = scan.nextDouble();

        int perc = 0;
        double salarioN;
        double reaj = 0;
        double valorReaj;

        if (salario >= 0.00 && salario <= 400.00) {
            perc = 15;
            reaj = 0.15;
        } else if (salario > 400.00 && salario <= 800.00) {
            perc = 12;
            reaj = 0.12;
        } else if (salario > 800.00 && salario <= 1200.00) {
            perc = 10;
            reaj = 0.10;
        } else if (salario > 1200.00 && salario <= 2000.00) {
            perc = 7;
            reaj = 0.07;
        } else if (salario > 2000.00) {
            perc = 4;
            reaj = 0.04;
        }

        valorReaj = reaj * salario;
        salarioN = valorReaj + salario;


        System.out.printf("Novo salario: %.2f%n", salarioN);
        System.out.printf("Reajuste ganho: %.2f%n", valorReaj);
        System.out.printf("Em percentual: %d%%", perc);

        scan.close();
    }
}
