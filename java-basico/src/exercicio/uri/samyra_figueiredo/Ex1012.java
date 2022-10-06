package exercicio.uri.samyra_figueiredo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1012 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, areaTri, areaCirc, areaTra, areaQua, areaRet;
        double pi = 3.14159;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areaTri = (a * c)/2;
        areaCirc = pi * Math.pow(c, 2);
        areaTra = ((a + b) * c)/2;
        areaQua = Math.pow(b, 2);
        areaRet = a * b;

        System.out.printf("TRIANGULO: %.3f %n", areaTri);
        System.out.printf("CIRCULO: %.3f %n", areaCirc);
        System.out.printf("TRAPEZIO: %.3f %n", areaTra);
        System.out.printf("QUADRADO: %.3f %n", areaQua);
        System.out.printf("RETANGULO: %.3f %n", areaRet);

        sc.close();
    }
}
