package exercicio.uri.natasha_busnardo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        int raio = sc.nextInt();

        double volume = (4 / 3.0) * pi * raio * raio * raio;

        System.out.printf("VOLUME = %.3f", volume);

        sc.close();

    }
}
