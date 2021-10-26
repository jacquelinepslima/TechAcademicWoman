package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        double valor = valorInicial;
        double resto100, resto50, resto20, resto10, resto5, resto2;
        double moeda1, moeda50, moeda25, moeda10, moeda5, moeda1Centavo;

        resto100 = valor/100;
        valor = valor%100;
        resto50 = valor/50;
        valor = valor%50;
        resto20 = valor/20;
        valor = valor%20;
        resto10 = valor/10;
        valor = valor%10;
        resto5 = valor/5;
        valor = valor%5;
        resto2 = valor/2;
        valor = valor%2;
        moeda1 = valor/1;
        valor = valor%1;
        moeda50 = valor/0.50;
        valor = valor%0.50;
        moeda25 = valor/0.25;
        valor = valor%0.25;
        moeda10 = valor/0.10;
        valor = valor%0.10;
        moeda5 = valor/0.05;
        valor = valor%0.05;
        moeda1Centavo = valor/0.01;
        valor = valor%0.01;

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
