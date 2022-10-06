package exercicio.uri.giovanna_santana;

import java.util.Scanner;

public class Ex1144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A, B, C;

        for (int i = 1; i < N; i++){
            A = i;
            B = i*i;
            C = i*i*i;

            System.out.println(A + " " + B + " " + C);

            System.out.println((A + 1) + " " + (B + 1) + " " + (C + 1));
        }

        sc.close();
    }
}
