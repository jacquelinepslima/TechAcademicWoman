package exercicio.uri.bruna_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();
        double y = entrada.nextDouble();

        double consumo = x / y;

        System.out.printf("%.3f km/l%n", consumo);

        entrada.close();
    }
}
