package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1158 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int soma = 0;
            int cont = 0;

            for (int j = x; cont < y; j++) {
                if (j % 2 != 0) {
                    soma += j;
                    cont += 1;
                }
            }
            System.out.println(soma);

        }
        /*int n = sc.nextInt();
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

        sc.close();*/
    }
}
