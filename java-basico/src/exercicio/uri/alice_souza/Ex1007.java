package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        int A, B, C, D;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        System.out.println("DIFERENCA = " + (A*B - C*D));
        sc.close();
    }
}
