package exercicio.uri.amanda_alves;

import java.util.Scanner;

public class Ex1142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = scanner.nextInt();
        int num1 = 1, num2 = 2, num3 = 3;

        for (int i = 0; i < linhas; i++) {
            System.out.println(num1 + " " + num2 + " " + num3 + " PUM");

            num1 += 4;
            num2 += 4;
            num3 += 4;
        }

    }
}
