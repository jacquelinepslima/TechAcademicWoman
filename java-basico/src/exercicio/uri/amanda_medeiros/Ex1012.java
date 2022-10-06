package exercicio.uri.amanda_medeiros;

import java.util.Locale;
import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        double valorA = scanner.nextDouble();
        double valorB = scanner.nextDouble();
        double valorC = scanner.nextDouble();

        double areaTriangulo = (valorA * valorC)/2;
        double areaCirculo = (Math.PI * Math.pow(valorC, 2));
        double areaTrapezio = ((valorA + valorB) * valorC)/2 ;
        double areaQuadrado = Math.pow(valorB, 2);
        double areaRetangulo = valorA * valorB;

        System.out.printf("TRIANGULO: %.3f %n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f %n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f %n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f %n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f", areaRetangulo);

        scanner.close();
    }
}
