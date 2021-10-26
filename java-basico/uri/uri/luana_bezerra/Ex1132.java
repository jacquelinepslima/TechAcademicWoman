package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {
        Scanner exercicio = new Scanner(System.in);

        int x = exercicio.nextInt();
        int y = exercicio.nextInt();
        int divisivel = 0;
        int laco;
        int soma = 0;

        if (x > y) {
            for (laco = y; laco < x + 1; laco++) {
                divisivel = y % 13;
                if (divisivel != 0) {
                    soma += y;
                }
                y++;
            }
            System.out.println(soma);

        } else if (y > x) {
            for (laco = x; laco < y + 1; laco++) {
                divisivel = x % 13;

                if (divisivel != 0) {
                    soma += x;
                }

                x++;
            }
            System.out.println(soma);
        }
        exercicio.close();

    }
}
