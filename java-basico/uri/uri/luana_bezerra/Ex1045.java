package exercicio.uri.luana_bezerra;

import java.util.Locale;
import java.util.Scanner;

public class Ex1045 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner triangulos = new Scanner(System.in);

        float C = triangulos.nextFloat();
        float B = triangulos.nextFloat();
        float A = triangulos.nextFloat();

        if(A < B || A < C){
            System.out.println("NAO FORMA TRIANGULO");
        }

        else {
            if (A >= B + C) {
                System.out.println("NAO FORMA TRIANGULO");
            }

            if (A * A == (B * B) + (C * C)) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (A * A > (B * B) + (C * C)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if (A * A < (B * B) + (C * C)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (A == B && A == C && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }

        }

        triangulos.close();

    }
}
