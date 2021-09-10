package exercicio.uri.jacque_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.println("Digite o valor do raio(duas casas decimais)");
        double raio = sc.nextDouble();
        double area = pi * raio * raio;

        System.out.printf("A=%.4f%n",  area);

        sc.close();
    }
}
