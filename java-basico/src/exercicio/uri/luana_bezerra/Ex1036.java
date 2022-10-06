package exercicio.uri.luana_bezerra;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner bhaskara = new Scanner(System.in);

        double A = bhaskara.nextDouble();
        double B = bhaskara.nextDouble();
        double C = bhaskara.nextDouble();

        double delta = Math.pow(B,2)-4*A*C;
        double div = 2.0*A;
        double R1 = (-B + Math.sqrt(delta))/div;
        double R2 = (-B - Math.sqrt(delta))/div;

        if(div == 0 || delta < 0.0) {
            System.out.println("Impossivel calcular");
        }

        else{
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }

        bhaskara.close();
    }
}