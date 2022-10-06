package exercicio.uri.luana_bezerra;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner calculo = new Scanner(System.in);

        double A = calculo.nextDouble();
        double B = calculo.nextDouble();
        double C = calculo.nextDouble();

        double media = (A*2 + B*3 + C*5)/10;

        System.out.printf("MEDIA = %.1f", media);

        calculo.close();
    }
}
