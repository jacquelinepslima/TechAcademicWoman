package exercicio.uri.jacque_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1116 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x, y;

        for (int i = 0; i < N; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println((double) x / y);
            }
        }

        sc.close();
    }
}
