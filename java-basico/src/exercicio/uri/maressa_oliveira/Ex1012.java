package exercicio.uri.maressa_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double A,B,C,AREA;
        Scanner sc=new Scanner(System.in);
        A=sc.nextDouble();
        B=sc.nextDouble();
        C=sc.nextDouble();
        sc.close();
        AREA=(A*C)/2.0;
        System.out.printf("TRIANGULO : %.3f%n",AREA);
        AREA=3.14159*Math.pow(C,2);
        System.out.printf("CIRCULO : %.3f%n",AREA);
        AREA=((A+B)*C)/2.0;
        System.out.printf("TRAPEZIO : %.3f%n",AREA);
        AREA=Math.pow(B,2);
        System.out.printf("QUADRADO : %.3f%n",AREA);
        AREA=A*B;
        System.out.printf("RETANGULO : %.3f%n",AREA);

    }
}
