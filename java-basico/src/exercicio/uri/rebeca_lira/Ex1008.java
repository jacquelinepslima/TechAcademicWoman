package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int func;
        double horas;
        double valorHora;
        double sal;

        System.out.println("Número do funcionário: ");
        func = scanner.nextInt();

        System.out.println("Horas trabalhadas:");
        horas = scanner.nextInt();

        System.out.println("Valor por hora: ");
        valorHora = scanner.nextInt();

        sal = valorHora * horas;

        System.out.println("NUMBER = " + func);
        System.out.printf("SALARY = %.2f ", sal);

        scanner.close();
    }
}