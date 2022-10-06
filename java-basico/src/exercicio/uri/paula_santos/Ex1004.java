package exercicio.uri.paula_santos;

import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int PROD = x*y;

        System.out.printf("PROD = %d", PROD);

        scanner.close();
    }
}
