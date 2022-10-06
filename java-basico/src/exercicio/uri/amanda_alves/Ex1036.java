package exercicio.uri.amanda_alves;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        double valorA = scanner.nextDouble();
        double valorB = scanner.nextDouble();
        double valorC = scanner.nextDouble();

        double delta = Math.pow(valorB, 2) - 4.0 * valorA * valorC;

        if (delta < 0 | valorA == 0 ){
            System.out.println("Impossivel calcular");
        } else {
            double R1 = (-valorB + Math.sqrt(delta)) / (2.0 * valorA);
            double R2 = (-valorB - Math.sqrt(delta)) / (2.0 * valorA);
            System.out.printf("R1 = %.5f \n" +
                    "R2 = %.5f", R1, R2);
        }
    }
}
