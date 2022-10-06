package exercicio.uri.amanda_alves;

import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        int percentualReajuste = 0;
        double valorReajuste = 0;

        if (salario <= 400) {
            valorReajuste = (salario * 0.15);
            salario = salario + valorReajuste;
            percentualReajuste = 15;
        } else if (salario >= 400.01 && salario <= 800.00) {
            valorReajuste = (salario * 0.12);
            salario = salario + valorReajuste;
            percentualReajuste = 12;
        } else if (salario >= 800.01 && salario <= 1200.00) {
            valorReajuste = (salario * 0.10);
            salario = salario + valorReajuste;
            percentualReajuste = 10;
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            valorReajuste = (salario * 0.07);
            salario = salario + valorReajuste;
            percentualReajuste = 7;
        } else if (salario > 2000.00) {
            valorReajuste = (salario * 0.4);
            salario = salario + valorReajuste;
            percentualReajuste = 4;
        }

        System.out.printf("Novo salário: %.2f \n", salario);
        System.out.printf("Reajuste ganho: %.2f \n", valorReajuste);
        System.out.println("Em percentual: " + percentualReajuste + "%");
    }
}