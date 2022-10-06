package exercicio.uri.luana_bezerra;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner vendas = new Scanner(System.in);

        int codigo1 = vendas.nextInt();
        int quant1 = vendas.nextInt();
        double valor1 = vendas.nextDouble();
        int codigo2 = vendas.nextInt();
        int quant2 = vendas.nextInt();
        double valor2 = vendas.nextDouble();

        double valortotal = (quant1*valor1) + (quant2*valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valortotal);

        vendas.close();
    }
}
