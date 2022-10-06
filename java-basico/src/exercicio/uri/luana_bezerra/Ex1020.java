package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {

        Scanner idade = new Scanner(System.in);

        int N = idade.nextInt();

        int ano = N / 365;
        int restoAno = N % 365;

        int meses = restoAno / 30;
        int dias = restoAno % 30;

        System.out.println(ano + " anos (s)");
        System.out.println(meses + " mes (es)");
        System.out.println(dias + " dia (s)");

        idade.close();

    }

}
