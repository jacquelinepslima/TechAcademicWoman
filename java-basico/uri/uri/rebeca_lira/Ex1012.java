package exercicio.uri.rebeca_lira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float A, B, C;
        double areaTriang, areaCirc, areaTrap, areaQuad, areaRet;

        A = scanner.nextFloat();
        B = scanner.nextFloat();
        C = scanner.nextFloat();

        areaTriang = (A*C)/2;
        areaCirc = 3.14159 * C * C;
        areaTrap = ((A+B)*C)/2;
        areaQuad = B * B;
        areaRet = A * B;

        System.out.printf("TRIÂNGULO: %.3f %n", areaTriang);
        System.out.printf("CIRCULO: %.3f %n", areaCirc);
        System.out.printf("TRAPÉZIO: %.3f %n", areaTrap);
        System.out.printf("QUADRADO: %.3f %n", areaQuad);
        System.out.printf("RETÂNGULO: %.3f %n", areaRet);

        scanner.close();
    }
}
