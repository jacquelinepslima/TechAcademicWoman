package exercicio.uri.bruna_lima;

import java.util.Scanner;
import java.util.Locale;

public class Ex1008 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        int horas = entrada.nextInt();
        double valor = entrada.nextDouble();

        double salario = horas * valor;

        System.out.printf("NUMBER = %d%n", numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        entrada.close();
    }
}
