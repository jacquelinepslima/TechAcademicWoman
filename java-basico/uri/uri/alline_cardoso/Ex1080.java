package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, posicao = 0, maior = 0;

        for (int i = 1; i <= 100; i++) {
            num = scan.nextInt();
            if (num > maior) {
                maior = num;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
        scan.close();
    }
}
