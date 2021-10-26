package exercicio.uri.ana_caroline;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hrsGastas = sc.nextInt();
        int velMedia = sc.nextInt();

        double distancia = hrsGastas * velMedia;
        double litrosN = distancia / 12;

        System.out.printf("%.3f", litrosN);


        sc.close();
    }
}
