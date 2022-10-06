package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int prod;

        System.out.println("Escreva os dois números.");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        prod = num1 * num2;

        System.out.println("PROD = " + prod);

        scanner.close();
    }
}
