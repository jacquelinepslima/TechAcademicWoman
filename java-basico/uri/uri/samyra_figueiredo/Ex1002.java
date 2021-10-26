package exercicio.uri.samyra_figueiredo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1002 {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        double raio, area;

        raio = sc.nextDouble();

        area = 3.14159 * (raio * raio);

        System.out.println(String.format("A=%.4f", area));

        sc.close();
    }
}
