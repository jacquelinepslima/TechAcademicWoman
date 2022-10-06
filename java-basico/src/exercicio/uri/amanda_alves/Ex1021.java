package exercicio.uri.amanda_alves;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        int resto;
        int valorNotas = (int) valor;

        int nota100 = valorNotas / 100;
        resto = valorNotas % 100;
        int nota50 = resto / 50;
        resto = resto % 50;
        int nota20 = resto / 20;
        resto = resto % 20;
        int nota10 = resto / 10;
        resto = resto % 10;
        int nota5 = resto / 5;
        resto = resto % 5;
        int nota2 = resto / 2;
        resto = resto % 2;

        double valorMoeda = (valor - valorNotas) + resto;
        double restoMoeda;

        int moeda100 = (int) (valorMoeda);
        restoMoeda = valorMoeda % 1.0;
        int moeda50 = (int) (restoMoeda / 0.50);
        restoMoeda = restoMoeda % 0.50;
        int moeda25 = (int) (restoMoeda / 0.25);
        restoMoeda = restoMoeda % 0.25;
        int moeda10 = (int) (restoMoeda / 0.10);
        restoMoeda = restoMoeda % 0.10;
        int moeda5 = (int) (restoMoeda / 0.05);
        restoMoeda = restoMoeda % 0.05;
        int moeda1 = (int) (restoMoeda / 0.01);

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota (s) de R$ 100.00");
        System.out.println(nota50 + " nota (s) de R$ 50.00");
        System.out.println(nota20 + " nota (s) de R$ 20.00");
        System.out.println(nota10 + " nota (s) de R$ 10.00");
        System.out.println(nota5 + " nota (s) de R$ 5.00");
        System.out.println(nota2 + " nota (s) de R$ 2.00");;

        System.out.println("MOEDAS:");
        System.out.println(moeda100 + " moeda (s) de R$ 1.00");
        System.out.println(moeda50 + " moeda (s) de R$ 0.50");
        System.out.println(moeda25 + " moeda (s) de R$ 0.25");
        System.out.println(moeda10 + " moeda (s) de R$ 0.10");
        System.out.println(moeda5 + " moeda (s) de R$ 0.05");
        System.out.println(moeda1 + " moeda (s) de R$ 0.01");

    }
}
