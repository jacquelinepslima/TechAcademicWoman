package exercicio.uri.giovanna.santana;

import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double totalSalario = (totalVendas * 0.15) + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f%n", totalSalario);

        sc.close();
    }
}
