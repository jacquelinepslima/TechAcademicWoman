package exercicio.uri.alline_cardoso;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int distancia = scan.nextInt();
        double combustivel = scan.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.printf("%.3f km/l", consumoMedio);
        System.out.println();

        scan.close();
    }
}
