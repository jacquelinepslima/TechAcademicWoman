package exercicio.uri.ana_caroline;

import java.util.Scanner;

public class Ex1003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int soma = a + b;

        System.out.println();
        System.out.printf("SOMA = %d%n", soma);

        sc.close();
    }
}
