package exercicio.uri.jacque_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int nPecas = sc.nextInt();
        double valor = sc.nextDouble();
        int codigo2 = sc.nextInt();
        int nPecas2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double valorTotal = (nPecas * valor) + (nPecas2 * valor2);
        System.out.printf("VALOR A PAGAR: R$ %.2f",valorTotal);
    }
}
