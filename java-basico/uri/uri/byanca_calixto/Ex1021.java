package exercicio.uri.byanca_calixto;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double entrada = leitor.nextDouble();

        int cem = 100;
        int cinquenta = 50;
        int vinte = 20;
        int dez = 10;
        int cinco = 5;
        int dois = 2;
        int um = 1;
        double cinquentaCent = 0.50;
        double vinteEcincoCent = 0.25;
        double dezCent = 0.10;
        double umCent = 0.01;

        double notaCem = Math.abs(entrada/cem);
        double restoNotaCem = entrada%cem;
        double notaCinq = restoNotaCem/cinquenta;
        double  restoNotaCinq = notaCinq%cinquenta;

        System.out.println(notaCem);
        System.out.println(restoNotaCem);
        System.out.println(notaCinq);
        System.out.println(restoNotaCinq);

    }
}
