package exercicio.uri.samyra_figueiredo;

import java.util.Scanner;

public class Ex1007 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d, diferenca;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = a * b - c * d;

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();
    }
}
