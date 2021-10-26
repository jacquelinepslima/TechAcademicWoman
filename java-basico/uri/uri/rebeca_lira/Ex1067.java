package exercicio.uri.rebeca_lira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1067 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int x = scanner.nextInt(); x <= 1000 && x >= 1; x--) {
            if (x % 2 != 0) {
                x = x - 2;
                System.out.println(x);
            } else if (x % 2 == 0) {
                x = x - 1;
                System.out.println(x);
            }
        }

        scanner.close();
    }
}
