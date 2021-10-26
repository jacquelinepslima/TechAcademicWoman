package exercicio.uri.ana_caroline;

import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double R;
        double volume;

        R = scanner.nextDouble();

        volume = (4/3.0) * 3.14159 * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f %n", volume);


        scanner.close();
    }
}
