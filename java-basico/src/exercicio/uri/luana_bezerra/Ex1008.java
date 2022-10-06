package exercicio.uri.luana_bezerra;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner funcionario = new Scanner(System.in);

        System.out.println("Informe o número do funcionário: ");
        int numero = funcionario.nextInt();

        System.out.println("Informe o número de horas trabalhadas: ");
        int horas = funcionario.nextInt();

        System.out.println("Informe o valor que recebe por hora: ");
        double valor = funcionario.nextDouble();

        double salario = horas * valor;

        System.out.printf("NUMBER = %d%n", numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        funcionario.close();
    }
}
