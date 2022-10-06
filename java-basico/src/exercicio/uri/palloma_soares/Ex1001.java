package exercicio.uri.palloma_soares;

import java.util.Scanner;

public class Ex1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int B;

        A = sc.nextInt();
        B = sc.nextInt();

        int X = A + B;

        System.out.println("X = " + X);

        sc.close();
    }
}
