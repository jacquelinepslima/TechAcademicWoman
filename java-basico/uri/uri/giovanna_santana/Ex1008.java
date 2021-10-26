package exercicio.uri.giovanna_santana;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.printf("NUMBER = %d%n", qtdFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);

        sc.close();
    }
}
