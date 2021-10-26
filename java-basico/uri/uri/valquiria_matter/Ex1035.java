package exercicio.uri.valquiria_matter;

import java.util.Scanner;

public class Ex1035 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int soma1 = c + d;
        int soma2 = a + b;

        if ((b > c) && (d > a)) {
            if ((soma1 > soma2)) {
                if ((c > 0 && d > 0)) {
                    if (a % 2 == 0) {
                        System.out.println("Valores aceitos.");
                    }
                }
            }
        } else {
            System.out.println("Valores não aceitos.");
        }

    }

}

