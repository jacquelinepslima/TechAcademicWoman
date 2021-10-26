package exercicio.uri.amanda_alves;

import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double impostoDevidoFaixa1;
        double impostoDevidoFaixa2;
        double impostoDevidoFaixa3;
        double faixaCalculo;

        if (salario <= 2000.00) {
            System.out.println("ISENTO");
        } else if (salario >= 2000.01 && salario <= 3000) {
            faixaCalculo = salario - 2000;
            impostoDevidoFaixa1 = faixaCalculo * 0.08;
            System.out.printf("R$ %.2f \n", impostoDevidoFaixa1);
        } else if (salario >= 3000.01 && salario <= 4500) {
            faixaCalculo = salario - 3000.00;
            impostoDevidoFaixa2 = (faixaCalculo * 0.18) + (1000 * 0.08);
            System.out.printf("R$ %.2f \n", impostoDevidoFaixa2);
        } else if (salario >= 4500) {
            faixaCalculo = salario - 4500;
            impostoDevidoFaixa3 = (faixaCalculo * 0.28) + (1500 * 0.18) + (1000 * 0.08);
            System.out.printf("R$ %.2f \n", impostoDevidoFaixa3);
        }
    }
}