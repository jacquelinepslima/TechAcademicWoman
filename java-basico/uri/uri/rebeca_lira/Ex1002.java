package exercicio.uri.rebeca_lira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o valor do raio?");
        double raio = sc.nextDouble();

        double area  = Math.PI * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n",  area);

        sc.close();

    }
}
