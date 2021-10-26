package exercicio.uri.isabel_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double A,B,C,MEDIA=0;
        Scanner sc=new Scanner(System.in);
        A=sc.nextDouble();
        B=sc.nextDouble();
        C=sc.nextDouble();
        sc.close();
        MEDIA=(A*2+B*3+C*5)/(10.0);
        System.out.printf("MEDIA = %.1f%n",MEDIA);
    }
}
