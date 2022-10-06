package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex1146 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 1, i, num = 0;
        while (n != 0) {
            n = sc.nextInt();
            for (i = 1; i <= n; i++) {
                i = i;
                if (i == n) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                }
            }
            if (n != 0)
                System.out.println();
        }
        sc.close();
    }
}
