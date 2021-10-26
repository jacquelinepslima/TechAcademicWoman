package exercicio.uri.rebeca_lira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double peca1, peca2;
        double qtd1, qtd2;
        double preco1, preco2;
        double valorTotal;

        System.out.println("Digite o código, quantidade e preço da peça 1: ");
        peca1 = scanner.nextDouble();
        qtd1 = scanner.nextDouble();
        preco1 = scanner.nextDouble();

        System.out.println("Digite o código, quantidade e preço da peça 2: ");
        peca1 = scanner.nextDouble();
        qtd2 = scanner.nextDouble();
        preco2 = scanner.nextDouble();

        valorTotal = (qtd1 * preco1 + qtd2 * preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f.", valorTotal);

        scanner.close();
    }
}
