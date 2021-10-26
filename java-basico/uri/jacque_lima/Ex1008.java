package exercicio.uri.jacque_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int NUMBER = sc.nextInt();
        int HOURS = sc.nextInt();
        double valor = sc.nextDouble();

        double SALARY = HOURS * valor;

        System.out.printf("NUMBER = %d",NUMBER);
        System.out.println("");
        System.out.printf("SALARY = U$ %.2f",SALARY);

    }
}
