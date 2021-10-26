package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i != num + 1; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
