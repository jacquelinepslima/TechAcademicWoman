package exercicio.uri.ambrosia_andrade;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float n = sc.nextFloat();
        int notaCem, notaCinq, notaVinte, notaDez, notaCinco, notaDois;
        float resto;
        int moedaUm, moedaCinq, moedaVinteCinco, moedaDez, moedaCinco, moedaUmCent;

        notaCem = (int) n / 100;
        resto = n % 100;
        notaCinq = (int) resto / 50;
        resto =  resto % 50;
        notaVinte = (int) resto / 20;
        resto = resto % 20;
        notaDez = (int) resto / 10;
        resto =  resto % 10;
        notaCinco = (int) resto / 5;
        resto = resto % 5;
        notaDois = (int) resto / 2;
        resto = resto % 2;

        moedaUm = (int) resto;
        resto = resto % 1;
        moedaCinq = (int) (resto / 0.50);
        resto = resto % 0.50f;
        moedaVinteCinco = (int) (resto / 0.25);
        resto = resto % 0.25f;
        moedaDez = (int)(resto / 0.10f);
        resto = resto % 0.10f;
        moedaCinco = (int)(resto/0.05);
        resto = resto % 0.05f;
        moedaUmCent = (int) Math.round((resto/0.01));


        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n", notaCem);
        System.out.printf("%d nota(s) de R$ 50.00%n", notaCinq);
        System.out.printf("%d nota(s) de R$ 20.00%n", notaVinte);
        System.out.printf("%d nota(s) de R$ 10.00%n", notaDez);
        System.out.printf("%d nota(s) de R$ 5.00%n", notaCinco);
        System.out.printf("%d nota(s) de R$ 2.00%n", notaDois);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", moedaUm);
        System.out.printf("%d moeda(s) de R$ 0.50%n", moedaCinq);
        System.out.printf("%d moeda(s) de R$ 0.25%n", moedaVinteCinco);
        System.out.printf("%d moeda(s) de R$ 0.10%n", moedaDez);
        System.out.printf("%d moeda(s) de R$ 0.05%n", moedaCinco);
        System.out.printf("%d moeda(s) de R$ 0.01%n", moedaUmCent);

        sc.close();
    }
}
