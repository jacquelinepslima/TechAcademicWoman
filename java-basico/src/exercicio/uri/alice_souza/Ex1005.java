package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        sc.close();
        System.out.printf("MEDIA = %.5f%n", (A*3.5 + B*7.5)/11);
    }
}
