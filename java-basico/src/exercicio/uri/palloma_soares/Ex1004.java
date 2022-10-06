package exercicio.uri.palloma_soares;

import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();

        int PROD = valor1 * valor2;

        System.out.println("PROD = "+PROD);

        sc.close();
    }
}
