package exercicio.uri.amanda_medeiros;

import java.util.Scanner;

public class Ex1004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        int prod = valor1 * valor2;

        System.out.println("PROD =" + prod);

        scanner.close();
    }
}
