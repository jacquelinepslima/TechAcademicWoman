package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args){
        int num, horas;
        float valorHora, salario;

        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();
        horas = scanner.nextInt();
        valorHora = scanner.nextFloat();

        salario = horas * valorHora;

        System.out.printf("NUMBER = %d%n", num);
        System.out.printf("SALARY = U$ %.2f", salario);

        scanner.close();
    }
}
