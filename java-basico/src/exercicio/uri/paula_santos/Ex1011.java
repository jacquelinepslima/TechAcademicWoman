package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();
        //PI fixado pelo exercicio
        double PI = 3.14159;
        double volumeEsfera = (4/3.0)*PI*Math.pow(R,3);

        System.out.printf("VOLUME = %.3f %n", volumeEsfera );

        scanner.close();
    }
}
