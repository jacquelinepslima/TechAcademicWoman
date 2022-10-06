package exercicio.uri.palloma_soares;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta, formBhaskaraR1, formBhaskaraR2;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4.0 * a * c;
        if(a == 0 || delta < 0.0){
            System.out.println("Impossivel calcular");
        }
        else{
            formBhaskaraR1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            formBhaskaraR2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1 = %.5f%n", formBhaskaraR1);
            System.out.printf("R2 = %.5f%n", formBhaskaraR2);
        }

        sc.close();
    }
}
