package exercicio.uri.samyra_figueiredo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, qtdHoras;
        double valorHora, salario;

        numero = sc.nextInt();
        qtdHoras = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = qtdHoras * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f", salario);

        sc.close();
    }
}
