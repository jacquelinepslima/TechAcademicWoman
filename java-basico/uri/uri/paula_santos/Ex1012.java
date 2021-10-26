package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double areaTriang = (A*C)/2;
        double areaCirc = 3.14159*Math.pow(C,2);
        double areaTrap = ((A+B)*C)/2;
        double areaQuad = Math.pow(B,2);
        double areaRet = A*B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriang);
        System.out.printf("CIRCULO: %.3f%n", areaCirc);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrap);
        System.out.printf("QUADRADO: %.3f%n", areaQuad);
        System.out.printf("RETANGULO: %.3f%n", areaRet);

        scanner.close();
    }
}
