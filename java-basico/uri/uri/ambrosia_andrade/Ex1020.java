package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idadeEmDias = scanner.nextInt();
        int ano, meses, dias, auxiliar;
        ano = idadeEmDias / 365;
        auxiliar = idadeEmDias % 365;
        meses = auxiliar / 30;
        dias = auxiliar % 30;
        System.out.println(ano + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        scanner.close();
    }
}
