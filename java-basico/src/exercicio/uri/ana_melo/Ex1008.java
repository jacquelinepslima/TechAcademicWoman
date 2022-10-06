package exercicio.uri.ana_melo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFunc = sc.nextInt();
        int horasTrab = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = horasTrab * valorHora;

        System.out.printf("NUMBER = %d%n", numeroFunc);
        System.out.printf("SALARY = U$ %.2f", salario);

        sc.close();
    }
}
