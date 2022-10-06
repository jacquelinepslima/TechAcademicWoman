package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, maior = 0, posicao = 0;

        for (int i = 1; i <= 10; i++) {
            input = scanner.nextInt();
            if( input > maior ){
                maior = input;
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

        scanner.close();
    }
}
