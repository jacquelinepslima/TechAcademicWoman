package exercicios.uri.ana_caroline;

import java.util.Locale;
import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float x1, x2, y1, y2;
        double distancia;

        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();

        distancia = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.printf("%.4f", distancia);

        scanner.close(); 
    }
}
