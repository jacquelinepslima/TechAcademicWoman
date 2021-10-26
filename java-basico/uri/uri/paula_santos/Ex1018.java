package exercicio.uri.paula_santos;

import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorInicial = scanner.nextInt();
        int valor = valorInicial;
        int resto100, resto50, resto20, resto10, resto5, resto2, resto1;

        resto100 = valor/100;
        valor = valor%100;
        resto50 = valor/50;
        valor = valor%50;
        resto20 = valor/20;
        valor = valor%20;
        resto10 = valor /10;
        valor = valor%10;
        resto5 = valor/5;
        valor = valor%5;
        resto2 = valor/2;
        valor = valor%2;
        resto1 = valor/1;
        valor = valor%1;

        System.out.printf("%d %n", valorInicial);
        System.out.printf("%d nota(s) de R$ 100,00 %n", resto100);
        System.out.printf("%d nota(s) de R$ 50,00 %n", resto50);
        System.out.printf("%d nota(s) de R$ 20,00 %n", resto20);
        System.out.printf("%d nota(s) de R$ 10,00 %n", resto10);
        System.out.printf("%d nota(s) de R$   5,00 %n", resto5);
        System.out.printf("%d nota(s) de R$   2,00 %n", resto2);
        System.out.printf("%d nota(s) de R$   1,00 %n", resto1);

        scanner.close();
    }
}
