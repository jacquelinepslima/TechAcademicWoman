package exercicio.resolvido.natasha_busnardo;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Infome a largura:");
        double largura = sc.nextDouble();

        System.out.println("Infome o comprimento:");
        double comprimento = sc.nextDouble();

        System.out.println("Infome o valor do metro quadrado:");
        double valorM = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * valorM;

        System.out.printf("AREA = %.2f",area);
        System.out.println("");
        System.out.printf("PRECO = %.2f",preco);

    }
}
