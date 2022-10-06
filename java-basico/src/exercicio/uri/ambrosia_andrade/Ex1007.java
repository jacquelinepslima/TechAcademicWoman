package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args){
        int A, B, C, D, DIFERENCA;

        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);

        scanner.close();
    }
}
