package exercicio.uri.valquiria_matter;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número do funcionário");
        int numero = scan.nextInt();

        System.out.println("Digite o número de horas trabalhadas");
        int numeroHoras = scan.nextInt();

        System.out.println("Digite o valor que recebe por hora");
        double valorHora = scan.nextDouble();

        double salario = numeroHoras * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f",salario);


        scan.close();
    }
}
