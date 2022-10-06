package exercicio.uri.rebeca_lira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1037 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();
        String intervalo = "";

        if (num >= 0 && num <=25){
            intervalo = "(0,25]";
        }
        else if (num > 25 && num <= 50){
            intervalo = "(25,50]";
        }
        else if (num > 50 && num <=75){
            intervalo = "(50,75]";
        }
        else if (num >75 && num <=100){
            intervalo = "(75,100]";
        }

        System.out.println("Intervalo "+ intervalo);
        sc.close();
    }
}
