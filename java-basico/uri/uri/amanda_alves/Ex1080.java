package exercicio.uri.amanda_alves;

import java.util.Scanner;

public class Ex1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int posicao = 0;

        for (int i = 0; i < 15; i++) {
            int num = scanner.nextInt();
            if (num > maior) {
                maior = num;
                posicao = i + 1;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}
