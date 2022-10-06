package exercicio.uri.maressa_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A,B,C,delta,raiz1,raiz2;

        A=sc.nextDouble();
        B=sc.nextDouble();
        C=sc.nextDouble();
        delta = Math.pow(B,2) - (4 * A * C);
        if((delta>0)&&(A>0)){
            raiz1=(-B+Math.sqrt(delta))/(2*A);
            raiz2=(-B-Math.sqrt(delta))/(2*A);
            System.out.printf("R1 = %.5f%n",raiz1);
            System.out.printf("R2 = %.5f%n",raiz2);
        }else{
            System.out.println("Impossível calcular");
        }
        sc.close();
    }
}
