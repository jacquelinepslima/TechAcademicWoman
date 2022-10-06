package exercicio.uri.bruna_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int numero1 = entrada.nextInt();
        int quant1 = entrada.nextInt();
        double valor1 = entrada.nextDouble();

        int numero2 = entrada.nextInt();
        int quant2 = entrada.nextInt();
        double valor2 = entrada.nextDouble();

        double valorTotal = (quant1*valor1) + (quant2*valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        entrada.close();
    }
}
