package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex1020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int ano, mes, dias, restoDiv;

        ano = N/365;
        restoDiv = N % 365;

        mes = restoDiv/30;
        dias = restoDiv%30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");

        scanner.close();
    }

}
