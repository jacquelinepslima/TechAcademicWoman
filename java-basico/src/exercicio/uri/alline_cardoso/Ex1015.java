package exercicio.uri.alline_cardoso;

import java.util.Locale;
import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double x1, x2, y1, y2;

        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        double distancia = Math.sqrt(Math.pow((x2 -x1), 2) + Math.pow((y2 -y1), 2) );
        System.out.printf("%.4f%n", distancia);
        scan.close();
    }
}
