package exercicio.uri.ana_melo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        float x1, x2, y1, y2;
        double calculo;

        Scanner scanner = new Scanner(System.in);

        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        scanner.nextLine();
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();

        calculo = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.4f", calculo);

        scanner.close();

    }
}
