package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args){
        String nome;
        double salarioFixo, montanteVendas, total;

        Scanner scanner = new Scanner(System.in);

        nome = scanner.next();
        salarioFixo = scanner.nextDouble();
        montanteVendas = scanner.nextDouble();

        total = salarioFixo + (montanteVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", total);

        scanner.close();
    }
}
