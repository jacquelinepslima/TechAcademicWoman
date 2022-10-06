package exercicio.uri.evelin_ferraz;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o seu código de funcionário: ");
        int codFuncionario = sc.nextInt();

        System.out.println("Número de horas trabalhadas: H ");
        int horas = sc.nextInt();

        System.out.println("Valor que recebe por hora: R$");
        double valorH = sc.nextDouble();

        double salario = valorH * horas;

        System.out.printf("Código: %d%n", codFuncionario);
        System.out.printf("Salário: R$%.2f", salario);

        sc.close();
    }
}
