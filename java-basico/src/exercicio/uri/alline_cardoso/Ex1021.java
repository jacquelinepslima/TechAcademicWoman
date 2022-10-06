package exercicio.uri.alline_cardoso;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double valor, resto;
        double cem, cinquenta, vinte, dez, cinco, dois;
        double mUmReal, mCinquenta, mVinteCinco, mDez, mCinco, mUmCentavo;

        valor = scan.nextDouble();
        cem = valor / 100;
        resto = valor % 100;
        cinquenta = resto / 50;
        resto = resto % 50;
        vinte = resto / 20;
        resto = resto % 20;
        dez = resto / 10;
        resto = resto % 10;
        cinco = resto / 5;
        resto = resto % 5;
        dois = resto / 2;
        resto = resto % 2;

        mUmReal = resto;
        resto = resto -1;
        mCinquenta = resto / 0.50;
        resto = resto % 0.50;
        mVinteCinco = resto / 0.25;
        resto = resto % 0.25;
        mDez = resto / 0.10;
        resto = resto % 0.10;
        mCinco = resto / 0.05;
        resto = resto % 0.05;
        mUmCentavo = resto / 0.01;



        System.out.println("NOTAS:");
        System.out.println((int)(cem) + " nota(s) de R$ 100.00");
        System.out.println((int)cinquenta + " nota(s) de R$ 50.00");
        System.out.println((int)vinte + " nota(s) de R$ 20.00");
        System.out.println((int)dez + " nota(s) de R$ 10.00");
        System.out.println((int)cinco +" nota(s) de R$ 5.00");
        System.out.println((int)dois + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println((int)(mUmReal) + " moeda(s) de R$ 1.00");
        System.out.println((int)(mCinquenta) + " moeda(s) de R$ 0.50");
        System.out.println((int)(mVinteCinco) + " moeda(s) de R$ 0.25");
        System.out.println((int)(mDez) + " moeda(s) de R$ 0.10");
        System.out.println((int)(mCinco) + " moeda(s) de R$ 0.05");
        System.out.println((int)(mUmCentavo) + " moeda(s) de R$ 0.01");

        scan.close();

    }

}
