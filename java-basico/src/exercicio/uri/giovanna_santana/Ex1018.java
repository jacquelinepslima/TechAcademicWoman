package exercicio.uri.giovanna_santana;

import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int restoDiv, restoDiv1, restoDiv2, restoDiv3, restoDiv4, restoDiv5;
        int cedula100, cedula50, cedula20, cedula10, cedula5, cedula2, cedula1;

        cedula100 = N / 100;
        restoDiv = N % 100;

        cedula50 = (int) restoDiv / 50;
        restoDiv1 = restoDiv % 50;

        cedula20 = (int) restoDiv1 / 20;
        restoDiv2 = restoDiv1 % 20;

        cedula10 = (int) restoDiv2 / 10;
        restoDiv3 = restoDiv2 % 10;

        cedula5 = (int) restoDiv3 / 5;
        restoDiv4 = restoDiv3 % 5;

        cedula2 = (int) restoDiv4 / 2;
        restoDiv5 = restoDiv4 % 2;

        cedula1 = (int) restoDiv5 / 1;

        System.out.println(cedula100 + " nota(s) de R$ 100,00");
        System.out.println(cedula50 + " nota(s) de R$ 50,00");
        System.out.println(cedula20 + " nota(s) de R$ 20,00");
        System.out.println(cedula10 + " nota(s) de R$ 10,00");
        System.out.println(cedula5 + " nota(s) de R$ 5,00");
        System.out.println(cedula2 + " nota(s) de R$ 2,00");
        System.out.println(cedula1 + " nota(s) de R$ 1,00");

        sc.close();
    }
}
