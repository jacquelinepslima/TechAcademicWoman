package exercicio.uri.alicio_cunha;

import java.util.Scanner;

public class Ex1113 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != y) {// TRUE ou FALSE
            if (x < y) {// TRUE ou FALSE
                System.out.println("Crescente");
            }else {
                System.out.println("Decrescente");
            }
            x = scanner.nextInt(); // 8
            y = scanner.nextInt(); // 8
        }

        scanner.close();
    }
}
