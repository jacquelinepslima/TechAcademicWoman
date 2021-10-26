package exercicio.uri.rebeca_lira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double A, B, C;
        double delta, R1, R2;

        System.out.println("Digite os 3 valores.");
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        delta = B*B - 4*A*C;

        R1 = (-B + Math.sqrt(delta));
        if(delta<=0) {
            System.out.println("Impossível calcular R1.");
        } else {
            R1 = R1/(2*A);
            System.out.printf("R1 = %.5f %n", R1);
        }


        R2 = (-B - Math.sqrt(delta));
        if(delta<=0) {
            System.out.println("Impossível calcular R2.");
        } else {
            R2 = R2/(2*A);
            System.out.printf("R2 = %.5f", R2);
        }



        scanner.close();
    }
}
