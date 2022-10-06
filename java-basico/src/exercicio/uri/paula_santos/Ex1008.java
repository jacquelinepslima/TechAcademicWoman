package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int funcionario = scanner.nextInt();
        int horastrabalhadas = scanner.nextInt();
        double valorhora = scanner.nextDouble();

        double salario = horastrabalhadas*valorhora;

        System.out.printf("NUMBER = %d %n", funcionario);
        System.out.printf("SALARY = U$ %.2f %n", salario);

        scanner.close();
    }
}
