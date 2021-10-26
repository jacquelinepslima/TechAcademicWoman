package exercicio.uri.samyra_figueiredo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        double y, valorTotal;

        x = sc.nextInt();
        y = sc.nextDouble();

        valorTotal = x / y;

        System.out.printf("%.3f km/l", valorTotal);

        sc.close();
    }
}
