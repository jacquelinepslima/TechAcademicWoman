package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int peca1 = scanner.nextInt(), numeropeca1 = scanner.nextInt(); double valorpeca1 = scanner.nextDouble();
        int peca2 = scanner.nextInt(), numeropeca2 = scanner.nextInt(); double valorpeca2 = scanner.nextDouble();

        double valorapagar1 = numeropeca1*valorpeca1;
        double valorapagar2 = numeropeca2*valorpeca2;
        double valortotal = valorapagar1+valorapagar2;

        System.out.printf("VALOR A PAGAR = R$ %.2f %n",valortotal);

        scanner.close();
    }
}
