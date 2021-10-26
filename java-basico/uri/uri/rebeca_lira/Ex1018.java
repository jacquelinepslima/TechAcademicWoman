package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N;
        int qt100, qt50, qt20, qt10, qt5, qt2, qt1;
        int restoDiv;

        System.out.println("Digite o valor:");
        N = scanner.nextInt();

        qt100 = N/100;
        restoDiv = N%100;

        qt50 = restoDiv/50;
        restoDiv = restoDiv%50;

        qt20 = restoDiv/20;
        restoDiv = restoDiv%20;

        qt10 = restoDiv/10;
        restoDiv = restoDiv%10;

        qt5 = restoDiv/5;
        restoDiv = restoDiv%5;

        qt2 = restoDiv/2;
        restoDiv = restoDiv%2;

        qt1 = restoDiv/1;

        System.out.println(N);
        System.out.println(qt100 + " nota(s) de R$ 100,00");
        System.out.println(qt50 + " nota(s) de R$ 50,00");
        System.out.println(qt20 + " nota(s) de R$ 20,00");
        System.out.println(qt10 + " nota(s) de R$ 10,00");
        System.out.println(qt5 + " nota(s) de R$ 5,00");
        System.out.println(qt2 + " nota(s) de R$ 2,00");
        System.out.println(qt1 + " nota(s) de R$ 1,00");

        scanner.close();
    }

}
