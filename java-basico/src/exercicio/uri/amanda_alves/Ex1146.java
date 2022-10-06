package exercicio.uri.amanda_alves;

import java.util.Scanner;

public class Ex1146 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        while (X > 0) {
            for (int i = 1; i != 0 && i < X; i++) {
                System.out.print(i + " ");
            }
            System.out.println(X);
            X = scanner.nextInt();
        }

        scanner.close();


    }
}

