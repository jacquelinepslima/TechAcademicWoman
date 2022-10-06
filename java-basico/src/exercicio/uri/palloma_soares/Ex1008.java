package exercicio.uri.palloma_soares;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nrFuncionario = sc.nextInt();
        int hrTrabalhada = sc.nextInt();
        double vlPorHora = sc.nextDouble();

        double SALARY = hrTrabalhada * vlPorHora;

        System.out.println("NUMBER = "+nrFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);

        sc.close();
    }
}
