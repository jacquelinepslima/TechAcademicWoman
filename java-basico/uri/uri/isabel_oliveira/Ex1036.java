package exercicio.uri.isabel_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double A,B,C,DELTA=0;
        double [] RAIZ=new double[2];
        Scanner sc=new Scanner(System.in);
        A=sc.nextDouble();
        B=sc.nextDouble();
        C=sc.nextDouble();
        sc.close();
        DELTA=(Math.pow(B, 2) - 4 * A * C);
        if((A==0)||(DELTA<0)){
            System.out.println("Impossível calcular");
        }
        else {
           RAIZ[0] = (-B + Math.sqrt(DELTA) )/ (2 * A);
            RAIZ[1] = (-B - Math.sqrt(DELTA)) / (2 * A);
            System.out.printf("R1 = %.5f%n",RAIZ[0]);
            System.out.printf("R2 = %.5f%n",RAIZ[1]);
        }

    }
}
