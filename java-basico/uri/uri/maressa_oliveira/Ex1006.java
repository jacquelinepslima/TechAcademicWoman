package exercicio.uri.maressa_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        double A,B,C,MEDIA;
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        A=leia.nextDouble();
        B=leia.nextDouble();
        C=leia.nextDouble();
        MEDIA=((A*2)+(B*3)+(C*5))/10.0;
        System.out.printf("MEDIA = %.1f%n",MEDIA);
        leia.close();
    }
}
