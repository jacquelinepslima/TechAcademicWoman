package exercicio.uri.giovanna_santana;

import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int SOMA = A + B;

        System.out.printf("SOMA = %d ", SOMA);

        sc.close();
    }
}
