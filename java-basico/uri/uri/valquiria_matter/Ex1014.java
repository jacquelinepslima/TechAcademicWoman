package exercicio.uri.valquiria_matter;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distancia total percorrida em km");
        int km = scan.nextInt();

        System.out.println("Digite o total de combustível em l");
        double totalL  = scan.nextDouble();

        double consumoMedio = km/totalL;

        System.out.printf("%.3f",consumoMedio);



    }

}
