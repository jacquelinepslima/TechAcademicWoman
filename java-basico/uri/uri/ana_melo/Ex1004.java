package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int PROD = A * B;

        System.out.printf("PROD = %d", PROD);

        sc.close();
    }
}
