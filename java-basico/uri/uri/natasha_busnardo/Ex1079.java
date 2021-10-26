package exercicio.uri.natasha_busnardo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0; i<3; i++) {

            double numero1 = scan.nextDouble();
            double numero2 = scan.nextDouble();
            double numero3 = scan.nextDouble();

            double media = (((numero1 * 2)  + (numero2 * 3) + (numero3 * 5))) / 10;

            System.out.printf("%.1f", media);

        }
}   }
