package exercicio.uri.caroline_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double R = leitor.nextDouble();
        double pi = 3.14159;
        double calculo = (4.0/3*pi)*Math.pow(R,3);

        System.out.printf("VOLUME = %.3f", calculo);

        leitor.close();
    }
}
