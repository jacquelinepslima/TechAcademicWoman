package exercicio.uri.valquiria_matter;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o código 1");
        int codigo1 = scan.nextInt();

        System.out.print("Digite o número de peças 1");
        int numPecas1 = scan.nextInt();

        System.out.print("Digite o valor da peça 1");
        double valorPeca1 = scan.nextDouble();

        System.out.print("Digite o código 2");
        int codigo2 = scan.nextInt();

        System.out.print("Digite o número de peças 2");
        int numPecas2 = scan.nextInt();

        System.out.print("Digite o valor da peça 2");
        double valorPeca2 = scan.nextDouble();

        double valorTotal = (numPecas1 * valorPeca1) + (numPecas2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ = %.2f", valorTotal);

        scan.close();
    }

}
