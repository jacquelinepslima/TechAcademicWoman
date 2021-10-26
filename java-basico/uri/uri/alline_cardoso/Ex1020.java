package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade, anos, meses, dias, resto;
        idade = scan.nextInt();

        anos = idade / 365;
        resto = idade % 365;
        meses = resto / 30;
        dias = resto % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        scan.close();
    }
}
