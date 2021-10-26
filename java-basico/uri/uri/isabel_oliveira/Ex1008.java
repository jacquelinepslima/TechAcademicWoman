package exercicio.uri.isabel_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int numeroFuncionario,numeroHorasTrabalhadas;
        double valorPorHora,salario=0;
        Scanner sc=new Scanner(System.in);
        numeroFuncionario=sc.nextInt();
        numeroHorasTrabalhadas=sc.nextInt();
        valorPorHora=sc.nextDouble();
        sc.close();
        salario=numeroHorasTrabalhadas*valorPorHora;
        System.out.println("NUMBER = "+numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n",salario);
    }
}
