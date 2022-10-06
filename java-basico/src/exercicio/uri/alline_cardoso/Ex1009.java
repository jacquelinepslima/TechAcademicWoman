package exercicio.uri.alline_cardoso;

import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String nome;
        double salario, vendas;

        nome = scan.nextLine();
        salario = scan.nextDouble();
        vendas = scan.nextDouble();

        double comissao = vendas * 0.15;
        double total = comissao + salario;

        System.out.printf("TOTAL = R$ %.2f%n", total);

        scan.close();
    }
}
