package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);

        int A = sm.nextInt();
        int B = sm.nextInt();

        int soma = A + B;

        System.out.printf("SOMA = " + soma);
        System.out.println();
        sm.close();
    }
}
