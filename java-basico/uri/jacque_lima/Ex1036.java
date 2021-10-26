package exercicio.uri.jacque_lima;

import jdk.jshell.execution.LocalExecutionControl;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double delta;
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

       delta = Math.pow(B, 2) - (4 * A * C);

        if (A == 0 || delta < 0.0){
            System.out.println("Impossível Calcular");
        } else {

            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f", R2);
        }
        sc.close();

    }
}
