package exercicio.uri.samyra_figueiredo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();

        int ced100, ced50, ced20, ced10, ced5, ced2;
        int moeda1, moeda050, moeda025, moeda010, moeda05, moeda01;
        double restoValor;

        ced100 = (int) (n / 100);
        restoValor = n % 100;

        ced50 = (int) (restoValor / 50);
        restoValor %= 50;

        ced20 = (int) (restoValor / 20);
        restoValor %= 20;

        ced10 = (int) (restoValor / 10);
        restoValor %= 10;

        ced5 = (int) (restoValor / 5);
        restoValor %= 5;

        ced2 = (int) (restoValor / 2);
        restoValor %= 2;

        moeda1 = (int) (restoValor / 1);
        restoValor %= 1;

        moeda050 = (int) (restoValor / 0.50);
        restoValor %= 0.50;

        moeda025 = (int) (restoValor / 0.25);
        restoValor %= 0.25;

        moeda010 = (int) (restoValor / 0.10);
        restoValor %= 0.10;

        moeda05 = (int) (restoValor / 0.05);
        restoValor %= 0.05;

        moeda01 = (int) (restoValor / 0.01);
        restoValor %= 0.01;

        System.out.println("NOTAS");
        System.out.println(ced100 + " nota(s) de R$ 100,00");
        System.out.println(ced50 + " nota(s) de R$ 50,00");
        System.out.println(ced20 + " nota(s) de R$ 20,00");
        System.out.println(ced10 + " nota(s) de R$ 10,00");
        System.out.println(ced5 + " nota(s) de R$ 5,00");
        System.out.println(ced2 + " nota(s) de R$ 2,00");
        System.out.println("MOEDAS");
        System.out.println(moeda1 + " moeda(s) de R$ 1,00");
        System.out.println(moeda050 + " moeda(s) de R$ 0,50");
        System.out.println(moeda025 + " moeda(s) de R$ 0,25");
        System.out.println(moeda010 + " moeda(s) de R$ 0,10");
        System.out.println(moeda05 + " moeda(s) de R$ 0,05");
        System.out.println(moeda01 + " moeda(s) de R$ 0,01");

        scan.close();


    }

}
