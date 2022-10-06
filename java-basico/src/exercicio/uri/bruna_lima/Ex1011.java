package exercicio.uri.bruna_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double raio = calculo.nextDouble();
        double pi = 3.14159;
        double formula = (4/3.0) * pi * Math.pow(raio,3);

        System.out.printf("VOLUME = %.3f", formula);

        calculo.close();
    }
}
