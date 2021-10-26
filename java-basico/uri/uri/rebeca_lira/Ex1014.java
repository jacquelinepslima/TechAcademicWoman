package exercicio.uri.rebeca_lira;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double X, Y;
        double consumo;

        System.out.println("Qual foi a distância total e o total de combustível gasto?");
        X = scanner.nextDouble();
        Y = scanner.nextDouble();

        consumo = X/Y;

        System.out.printf("%.3f km/l", consumo);

        scanner.close();
    }
}
