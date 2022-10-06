package exercicio.uri.ana_caroline;

import java.util.Locale;
import java.util.Scanner;

public class Ex1037 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        if(num >= 0 && num <= 25.0000){
            System.out.println("Intervalo [0,25]");

        } else if (num > 25.0000 && num <= 50.0000){
            System.out.println("Intervalo (25,50]");

        }else if (num > 50.0000 && num <= 75.0000){
            System.out.println("Intervalo (50,75]");

        } else if (num > 75.0000 && num <= 100.0000){
            System.out.println("Intervalo (75,100]");

        } else {
            System.out.println("Fora de intervalo");
        }



        sc.close();
    }
}
