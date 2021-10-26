package exercicio.uri.byanca_calixto;

import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float salario;
        double porcentagem = 0.0;
        double p1, p2, p3;
        salario = scanner.nextFloat();

        if (salario >= 0.00 && salario <= 2000.00) {
            System.out.println("Isento.");
        } else if (salario >= 2000.01 && salario <= 3000.00) {
            porcentagem = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f", porcentagem);
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            p1 = (salario - 3000) * 0.18;
            p2 = 1000 * 0.08;
            porcentagem = p1 + p2;
            System.out.printf("R$ %.2f", porcentagem);
        } else if (salario >= 4500.01) {
            p1 = (salario - 4500) * 0.28;
            p2 = 1500 * 0.18;
            p3 = 1000 * 0.08;
            porcentagem = p1 + p2 + p3;
            System.out.printf("R$ %.2f", porcentagem);
        }



        scanner.close();
    }
}
