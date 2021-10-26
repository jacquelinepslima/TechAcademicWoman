package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;
        int anos, meses, dias;
        int restoDiv;

        System.out.println("Escreva sua idade em dias.");

        idade = scanner.nextInt();

        anos = idade/365;
        restoDiv = idade%365;

        meses = restoDiv/30;
        restoDiv = restoDiv%30;

        dias = restoDiv/1;

        System.out.println(anos + " ano(s).");
        System.out.println(meses + " mes(es).");
        System.out.println(dias + " dia(s).");

        scanner.close();
    }
}
