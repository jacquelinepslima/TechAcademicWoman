package exercicio.uri.amanda_alves;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        int codigo1 = scanner.nextInt();
        int numero1 = scanner.nextInt();
        double valor1 = scanner.nextDouble();

        int codigo2 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();

        double valorPagar = (numero1 * valor1) + (numero2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPagar);
    }
}
