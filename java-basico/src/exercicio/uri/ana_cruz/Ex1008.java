package exercicio.uri.ana_cruz;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int NUMBER = scanner.nextInt();
        int HORAS = scanner.nextInt();
        double VALOR_HORA = scanner.nextDouble();

        double SALARY = VALOR_HORA*HORAS;

        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);

        scanner.close();
    }
}
