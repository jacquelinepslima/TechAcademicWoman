package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        int X;
        double Y;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextDouble();
        System.out.printf("%.3f km/l", X/Y);
        sc.close();
    }
}
