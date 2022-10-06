package exercicio.uri.natasha_busnardo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        if(A < B){
            A = A + B;
            B = A - B;
            A = A - B;
        }
        if(A < C){
            A = A + C;
            C = A - C;
            A = A - C;
        }
        if(B < C){
            B = B + C;
            C = B - C;
            B = B - C;
        }
        if(A >= (B+C))
            System.out.println("NAO FORMA TRIANGULO");
        else {
            if ((A * A) == ((B * B) + (C * C)))
                System.out.println("TRIANGULO RETANGULO");
            else if ((A * A) > ((B * B) + (C * C)))
                System.out.println("TRIANGULO OBTUSANGULO");
            else if ((A * A) < ((B * B) + (C * C)))
                System.out.println("TRIANGULO ACUTANGULO");

            if ((A == B) && (B == C))
                System.out.println("TRIANGULO EQUILATERO");
            if (((A != B) && (B == C)) || ((A == B) && (B != C)))
                System.out.println("TRIANGULO ISOSCELES");
        }

    }
}
