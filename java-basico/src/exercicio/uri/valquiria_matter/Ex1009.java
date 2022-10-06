package exercicio.uri.valquiria_matter;

import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double salarioFixo, totalVendas, salarioFinal;

        nome = sc.nextLine();
        salarioFixo = sc.nextDouble();
        totalVendas = sc.nextDouble();

        salarioFinal = (totalVendas * 15/100) + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f", salarioFinal);

        sc.close();
    }
}
