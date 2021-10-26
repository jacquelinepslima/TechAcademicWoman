package exercicio.uri.giovanna_santana;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int DIFERENCA = (A * B) - (C * D) ;

        System.out.printf("DIFERECA = %d", DIFERENCA);

        sc.close();
    }
}
