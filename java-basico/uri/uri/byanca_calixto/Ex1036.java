package exercicio.uri.byanca_calixto;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double potenciab = Math.pow(b,2);
        double delta = potenciab-4.0 * a * c;


        if ( a == 0 || delta < 0){
            System.out.println("Impossivel calcular");

        } else {
            double bhaskaraPositivo = (-b+Math.sqrt(delta))/2*a;
            double bhaskaraNegativo = (-b-Math.sqrt(delta))/2*a;
            System.out.printf("R1 = %.5f", bhaskaraPositivo);
            System.out.printf("R2 = %.5f", bhaskaraNegativo);
        }

        sc.close();


    }
}
