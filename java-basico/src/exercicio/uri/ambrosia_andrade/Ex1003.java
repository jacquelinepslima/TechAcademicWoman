package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args){

        int A, B, SOMA;

        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        B = scanner.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        scanner.close();
    }
}
