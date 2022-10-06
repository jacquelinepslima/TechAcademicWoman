package exercicio.uri.luana_bezerra;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner automovel = new Scanner(System.in);

        //distância total percorrida
        int X = automovel.nextInt();
        //total de combustível gasto
        float Y = automovel.nextFloat();

        double consumo = X/Y;

        System.out.printf("%.3f km/l", consumo);

        automovel.close();
    }
}
