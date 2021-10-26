package exercicio.uri.samyra_figueiredo;

import java.util.Scanner;

public class Ex1020 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int anos, meses, dias, idadeEmDias, resto;

        idadeEmDias = scan.nextInt();

        anos = idadeEmDias / 365;
        resto = idadeEmDias % 365;

        meses = resto / 30;
        resto %= 30;

        dias = resto / 1;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        scan.close();



    }


}

