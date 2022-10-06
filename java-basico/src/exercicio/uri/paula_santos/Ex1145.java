package exercicio.uri.paula_santos;

import java.util.Scanner;

public class Ex1145 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        for (int a = 1; a <= Y; a++) {
            System.out.printf("%d ", a);
            if (a % X == 0) {
                System.out.println("");
            }
        }
    }
}