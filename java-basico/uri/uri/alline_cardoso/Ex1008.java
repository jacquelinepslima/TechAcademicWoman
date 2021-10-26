package exercicio.uri.alline_cardoso;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sl = new Scanner(System.in);

        int func = sl.nextInt();
        int horas = sl.nextInt();
        double valorHr = sl.nextDouble();

        double salario = horas * valorHr;

        System.out.printf("NUMBER = %d%n", func);
        System.out.printf("SALARY = U$ %.2f", salario);

        System.out.println();
        sl.close();
    }
}
