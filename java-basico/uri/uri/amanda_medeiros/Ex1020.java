package exercicio.uri.amanda_medeiros;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();

        int anos, meses, dias, restoDivisao;

        anos = idade / 365;
        restoDivisao = idade % 365;

        meses = restoDivisao / 30;
        dias = restoDivisao % 30;

        System.out.printf(anos + " ano(s) " + meses + " me(es) " + dias + " dia(s) ");


        scanner.close();
    }
}
