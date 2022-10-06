package exercicio.uri.maressa_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
        double A,B,MEDIA;
        Locale.setDefault(Locale.US);
        Scanner media = new Scanner(System.in);
        A=media.nextDouble();
        B=media.nextDouble();
        MEDIA=((A*3.5)+(B*7.5))/11.0;
        System.out.printf("MEDIA = %.5f%n",MEDIA);
        media.close();
    }
}
