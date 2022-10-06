package exercicio.uri.samyra_figueiredo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qtd1, qtd2;
        double valorU1, valorU2, valorFinal;

        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        valorU1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        valorU2 = sc.nextDouble();

        valorFinal = (qtd1 * valorU1) + (qtd2 * valorU2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorFinal);

        sc.close();
    }
}
