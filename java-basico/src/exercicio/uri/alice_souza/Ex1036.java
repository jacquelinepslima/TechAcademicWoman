package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        double delta = (B*B -4*A*C);
        double x1 , x2;

        if (A==0 || delta<0) {
            System.out.println("Impossível calcular");
        }else{
            x1 = (-B + Math.sqrt(delta))/(2*A);
            x2 = (-B - Math.sqrt(delta))/(2*A);
            System.out.printf("R1 = %.5f",x1);
            System.out.printf("R2 = %.5f",x2);

        }
        scan.close();
    }
}
