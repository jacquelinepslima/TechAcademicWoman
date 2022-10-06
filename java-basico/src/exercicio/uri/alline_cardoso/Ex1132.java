package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int soma = 0;

        for (int i = x; i < y + 1; i++) {
            if (i % 13 != 0) {
                soma = soma + i;
            }
        }
        System.out.println(soma);
        scan.close();
    }
}

