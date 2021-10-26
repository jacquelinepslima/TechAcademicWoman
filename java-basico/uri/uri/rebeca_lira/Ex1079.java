package exercicio.uri.rebeca_lira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int y = 0; y < N; y++) {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();
            double media = ((num1*2) + (num2*3) + (num3*5))/10;
            System.out.printf("%.1f", media);
        }

        scanner.close();
    }
}
