package exercicio.uri.ana_caroline;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int hrs = sc.nextInt();
        double valorPorHora = sc.nextDouble();

        double salario = hrs * valorPorHora;

        System.out.printf("NUMBER = %d%n", num);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        sc.close();
    }
}
