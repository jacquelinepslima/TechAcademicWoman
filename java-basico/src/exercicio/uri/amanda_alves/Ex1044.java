package exercicio.uri.amanda_alves;

import java.util.Scanner;

public class Ex1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B && A % B == 0) {
            System.out.println("Sao mutiplos");
        } else if (A < B && B % A == 0) {
            System.out.println("Sao mutiplos");
        } else {
            System.out.println("Nao sao mutiplos");
        }

        sc.close();
    }
}
