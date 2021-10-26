package exercicio.uri.bruna_lima;
//
import java.util.Locale;
import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double triangulo = (a * c) / 2;
        double circulo = Math.PI * (Math.pow(c, 2));
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b*b;
        double retangulo = a*b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        entrada.close();
    }
}
