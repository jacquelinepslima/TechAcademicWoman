package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nomeFunc = scanner.next();
        double salarioFixo = scanner.nextDouble();
        double vendas = scanner.nextDouble();

        double comissao = (vendas*0.15)+salarioFixo;

        System.out.printf("TOTAL = R$ %.2f %n", comissao);

        scanner.close();
    }
}
