package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {
        int A, B, produto;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        produto = A*B;
        System.out.println("PROD = " + produto);
        sc.close();
    }
}
