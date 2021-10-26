package exercicio.uri.maressa_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1045 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a, b, c, maior;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if (b > a) {
            maior = b;
            b = a;
            a = maior;

        } else if (c > a) {
            maior = c;
            c = a;
            a = maior;
        }

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {

            if(Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))){
                System.out.println("TRIANGULO RETANGULO");
            } else if ((a * a) > ((b*b) + (c*c))){
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if ((a == b) && (b == c)) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if ((a == b) || (b == c) || (c == a)){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        scanner.close();
    }
}
