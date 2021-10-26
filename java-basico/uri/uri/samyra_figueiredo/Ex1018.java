package exercicio.uri.samyra_figueiredo;

import java.util.Scanner;

public class Ex1018 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ced100, ced50, ced20, ced10, ced5, ced2, ced1, restoValor;

        int n = scan.nextInt();

        ced100 = n / 100;
        restoValor = n % 100;

        ced50 = restoValor / 50;
        restoValor %= 50;

        ced20 = restoValor / 20;
        restoValor %= 20;

        ced10 = restoValor / 10;
        restoValor %= 10;

        ced5 = restoValor / 5;
        restoValor %= 5;

        ced2 = restoValor / 2;
        restoValor %= 2;

        ced1 = restoValor / 1;
        restoValor %= 1;

//        ced50 = (n % 100) / 50;
//        ced20 = ((n % 100) % 50) /20;
//        ced10 = (((n % 100) % 50) % 20) / 10;
//        ced5 = ((((n % 100) % 50) % 20) % 10) / 5;
//        ced2 = (((((n % 100) % 50) % 20) % 10) % 5) / 2;
//        ced1 = ((((((n % 100) % 50) % 20) % 10) % 5) % 2) / 1;

        System.out.println(ced100 + " nota(s) de R$ 100,00");
        System.out.println(ced50 + " nota(s) de R$ 50,00");
        System.out.println(ced20 + " nota(s) de R$ 20,00");
        System.out.println(ced10 + " nota(s) de R$ 10,00");
        System.out.println(ced5 + " nota(s) de R$ 5,00");
        System.out.println(ced2 + " nota(s) de R$ 2,00");
        System.out.println(ced1 + " nota(s) de R$ 1,00");

        scan.close();
    }
}
