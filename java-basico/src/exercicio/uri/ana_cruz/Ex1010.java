package exercicio.uri.ana_cruz;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int codigo1 = scanner.nextInt();
        int quantidade1 = scanner.nextInt();
        double valorPeca1 = scanner.nextDouble();

        int codigo2 = scanner.nextInt();
        int quantidade2 = scanner.nextInt();
        double valorPeca2 = scanner.nextDouble();

        double valorTotal = (quantidade1*valorPeca1) + (quantidade2*valorPeca2);

        System.out.printf("VALOR A PAGAR = R$ %.2f%n", valorTotal);

        scanner.close();
    }

}
