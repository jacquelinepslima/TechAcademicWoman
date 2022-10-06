package exercicio.uri.giovanna_santana;

import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorA = sc.nextInt();
        int valorB = sc.nextInt();

        int PROD = valorA * valorB;

        System.out.printf("PROD = %d", PROD);

        sc.close();
    }
}
