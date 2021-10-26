package exercicio.uri.ana_cruz;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        int valor = (int) (valorInicial*100.0);
        int resto100, resto50, resto20, resto10, resto5, resto2;
        int moeda1, moeda50, moeda25, moeda10, moeda5, moeda1Centavo;

        resto100 = valor/10000;
        valor = valor%10000;

        resto50 = valor/5000;
        valor = valor%5000;

        resto20 = valor/2000;
        valor = valor%2000;

        resto10 = valor/1000;
        valor = valor%1000;

        resto5 = valor/500;
        valor = valor%500;

        resto2 = valor/200;
        valor = valor%200;

        moeda1 = valor/100;
        valor = valor%100;

        moeda50 = valor/50;
        valor = valor%50;

        moeda25 = valor/25;
        valor = valor%25;

        moeda10 = valor/10;
        valor = valor%10;

        moeda5 = valor/5;
        valor = valor%5;

        moeda1Centavo = valor;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00 %n", (int) resto100);
        System.out.printf("%d nota(s) de R$ 50.00 %n", (int) resto50);
        System.out.printf("%d nota(s) de R$ 20.00 %n", (int)resto20);
        System.out.printf("%d nota(s) de R$ 10.00 %n", (int) resto10);
        System.out.printf("%d nota(s) de R$  5.00 %n", (int) resto5);
        System.out.printf("%d nota(s) de R$  2.00 %n",(int) resto2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$  1.00 %n",(int) moeda1);
        System.out.printf("%d moeda(s) de R$  0.50 %n",(int) moeda50);
        System.out.printf("%d moeda(s) de R$  0.25 %n",(int) moeda25);
        System.out.printf("%d moeda(s) de R$  0.10 %n",(int) moeda10);
        System.out.printf("%d moeda(s) de R$  0.05 %n",(int) moeda5);
        System.out.printf("%d moeda(s) de R$  0.01 %n",(int) moeda1Centavo);

        scanner.close();
    }
}
