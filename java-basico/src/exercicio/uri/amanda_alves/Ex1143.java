package exercicio.uri.amanda_alves;

import java.util.Scanner;

public class Ex1143 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = scanner.nextInt();
        int num1 = 1, num2 = 2, num3 = 3;

        for (int i = 0; i < linhas; i++) {
            num2 = num1 * num1;
            num3 = num2 * num1;

            System.out.println(num1 + " " + num2 + " " + num3);
            num1 += 1;
        }

    }
}
