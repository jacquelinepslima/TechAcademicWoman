package exercicio.uri.amanda_alves;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int horas = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        double salario = horas * valorHora;

        System.out.printf("NUMBER = %d\n", numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
