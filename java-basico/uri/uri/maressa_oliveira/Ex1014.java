package exercicio.uri.maressa_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        int X;
        double Y,cg;
        Locale.setDefault(Locale.US);
        Scanner automovel = new Scanner(System.in);
        X=automovel.nextInt();
        Y=automovel.nextDouble();
        cg=X/Y;
        System.out.printf("%.3f km/l%n",cg);
        automovel.close();
    }
}
