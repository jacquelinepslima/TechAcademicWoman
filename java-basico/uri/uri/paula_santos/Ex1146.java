package exercicio.uri.paula_santos;

import java.util.Scanner;

public class Ex1146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = 0;
        while ((X = scanner.nextInt()) != 0) {
            for (int a = 1; a <= X; a++) {
                if (a == X) {
                    System.out.print(a + "\n");
                } else {
                    System.out.print(a + " ");
                }
            }
        }
        scanner.close();
    }
}

