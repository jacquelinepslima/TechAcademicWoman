package exercicio.uri.isabel_oliveira;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantidadeDias, anos, meses, dias,restoDivisao;
        quantidadeDias=scanner.nextInt();
        anos=quantidadeDias/365;
        restoDivisao=quantidadeDias%365;
        meses=restoDivisao/30;
        dias=restoDivisao %30;
        System.out.println(anos+" ano(s)");
        System.out.println(meses+" mes(es)");
        System.out.println(dias+" dia(s)");
        scanner.close();
    }
}
