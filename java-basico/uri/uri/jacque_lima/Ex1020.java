package exercicio.uri.jacque_lima;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int ano, mes, dia;

        ano = idade / 365;
        idade %= 365;

        mes = idade / 30;
        idade %= 30;

        dia = idade;


        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        sc.close();
    }
}
