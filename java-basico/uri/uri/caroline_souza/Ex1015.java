package exercicio.uri.caroline_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1015 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double x1 = leitor.nextDouble();
        double y1 = leitor.nextDouble();

        double x2 = leitor.nextDouble();
        double y2 = leitor.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        System.out.printf("%.4f",distancia);


        leitor.close();

    }
}
