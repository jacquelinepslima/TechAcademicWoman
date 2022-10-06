package exercicio.uri.samyra_figueiredo;

import java.util.Scanner;

public class Ex1080 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maiorValor = 0;
        int posicao = 1;
        int x;

        for (int i = 1; i <= 100; i++) {
            x = sc.nextInt();
            if (i == 1) {
                maiorValor = x;
            } else if (x > maiorValor) {
                maiorValor = x;
                posicao = i;
            }
        }

        System.out.println(maiorValor);
        System.out.println(posicao);

        sc.close();
    }
}
