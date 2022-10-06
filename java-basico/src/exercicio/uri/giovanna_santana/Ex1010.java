package exercicio.uri.giovanna_santana;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca1 = sc.nextInt(); int qtdPeca1 = sc.nextInt(); double valorUnitarioPeca1 = sc.nextDouble();

        int codigoPeca2 = sc.nextInt(); int qtdPeca2 = sc.nextInt(); double valorUnitarioPeca2 = sc.nextDouble();

        double linha1 = qtdPeca1 * valorUnitarioPeca1;
        double linha2 = qtdPeca2 * valorUnitarioPeca2;
        double totalPagar = linha1 + linha2;

        System.out.printf("VALOR À PAGAR: R$ %.2f ", totalPagar);

        sc.close();
    }
}
