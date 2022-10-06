package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        int funcionario, horas;
        float valorHora;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        funcionario = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextFloat();
        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f", horas*valorHora);
        sc.close();
    }
}
