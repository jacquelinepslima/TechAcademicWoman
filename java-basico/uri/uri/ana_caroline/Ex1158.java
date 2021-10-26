package exercicio.uri.ana_caroline;

import java.util.Scanner;

public class Ex1158 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soma;

        for(int i = 0; i < n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            soma = 0;
            int j = 0;

            if (x % 2 == 0) {
                x += 1;
                while (j < y) {
                    soma += x;
                    x += 2;
                    j++;
                }

            } else {
                while (j < y) {
                    soma += x;
                    x += 2;
                    j++;
                }
            }

            System.out.println(soma);
        }

        sc.close();
    }
}
