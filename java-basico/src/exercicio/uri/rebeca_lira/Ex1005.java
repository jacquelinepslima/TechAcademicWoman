package exercicio.uri.rebeca_lira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float A, B;
        double pesoA, pesoB, media;

        System.out.println("Quais são as notas A e B?");
        A = scanner.nextFloat();
        B = scanner.nextFloat();

        pesoA = A * 3.5;
        pesoB = B * 7.5;
        media = (pesoA + pesoB)/11;

        System.out.printf("A média é: %.5f", media);

        scanner.close();
    }
}
