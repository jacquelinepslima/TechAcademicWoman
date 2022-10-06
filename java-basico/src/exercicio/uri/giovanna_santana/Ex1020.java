package exercicio.uri.giovanna_santana;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadeDias = sc.nextInt();
        int restoDiv, restoDiv1;

        int ano = (int) idadeDias / 365;
        restoDiv = idadeDias % 365;

        int mes = (int) restoDiv / 30;
        restoDiv1 = restoDiv % 30;

        int dias = (int) restoDiv1 / 1;

        System.out.println(ano + " ano (s)");
        System.out.println(mes + " mes (es)");
        System.out.println(dias + " dia (s)");

        sc.close();
    }
}
