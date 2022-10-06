package exercicio.uri.amanda_alves;

import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nome = scanner.next();
        double fixo = scanner.nextDouble();
        double vendas = scanner.nextDouble();
        double comissao = (vendas * 15 / 100) + fixo;

        System.out.printf("TOTAL = R$ %.2f", comissao);
    }
}
