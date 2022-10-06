package exercicio.uri.valquiria_matter;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex1002{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();

        double n = 3.14159;
        double area = n * (Math.pow(raio,2));

        DecimalFormat df = new DecimalFormat("#,###.0000");
        System.out.println("A= " + df.format(area));

        scan.close();

    }

}
