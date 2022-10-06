package exercicio.uri.bruna_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner calculo = new Scanner(System.in);

        float x1 = calculo.nextFloat();
        float y1 = calculo.nextFloat();
        float x2 = calculo.nextFloat();
        float y2 = calculo.nextFloat();

        double distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        System.out.printf("%.4f", distancia);

        calculo.close();
    }
}
