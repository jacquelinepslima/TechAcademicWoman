package exercicio.uri.rebeca_lira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nome;
        double salarioFixo;
        double totalVendas;
        double comissao;
        double total;

        nome = scanner.next();
        salarioFixo = scanner.nextDouble();
        totalVendas = scanner.nextDouble();

        comissao = totalVendas * 0.15;
        total = salarioFixo + comissao;

        System.out.printf("TOTAL = R$%.2f", total);

        scanner.close();
    }
}
