package exercicio.uri.giovanna_santana;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double delta = Math.pow(B, 2) - 4 * A * C;
        double R1,R2;

        if (delta < 0.0 || A == 0){
            System.out.println("Impossivel calcular");
        }else {
            R1 = (- B + Math.sqrt(delta)) / (2 * A);
            R2 = (- B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("%.5f%n", R1);
            System.out.printf("%.5f%n", R2);
        }


        sc.close();
    }
}
