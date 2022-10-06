package exercicio.uri.inajara_pereira;

import java.util.Scanner;

public class Ex1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int b = i * i;
            int c = i * i * i;
            System.out.printf("%d %d %d%n", i, b, c);
        }
        sc.close();
    }
}
