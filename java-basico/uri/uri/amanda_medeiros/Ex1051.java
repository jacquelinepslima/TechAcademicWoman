package exercicio.uri.amanda_medeiros;

import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double salario, impostos;

        salario = scanner.nextDouble();

        if(salario >= 0.0 && salario < 2000.01){
            System.out.println("Isento");

        } else if(salario >= 2000.01 && salario < 3000.01){
            impostos = (salario - 2000.00) * 0.08;
            System.out.printf("R$%.2f", impostos);

        } else if(salario >= 3000.01 && salario < 4500.01){
            impostos = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
            System.out.printf("R$%.2f", impostos);

        } else {
            impostos = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
            System.out.printf("R$%.2f", impostos);
        }

        scanner.close();
    }
}