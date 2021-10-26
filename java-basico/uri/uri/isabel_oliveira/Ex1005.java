package exercicio.uri.isabel_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double A,B,MEDIA=0;
        Scanner sc=new Scanner(System.in);
        A=sc.nextDouble();
        B=sc.nextDouble();
        sc.close();
        MEDIA=(A*3.5+B*7.5)/(11.0);
        System.out.printf("MEDIA = %.5f%n",MEDIA);
    }
}
