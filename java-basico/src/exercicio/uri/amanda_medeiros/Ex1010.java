package exercicio.uri.amanda_medeiros;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int codigo1 = scanner.nextInt();
        int qtd1 = scanner.nextInt();
        double valor1 = scanner.nextDouble();

        int codigo2 = scanner.nextInt();
        int qtd2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();

        double total1 = qtd1 * valor1;
        double total2 = qtd2 * valor2;

        double total = total1 + total2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

        scanner.close();
    }
}
