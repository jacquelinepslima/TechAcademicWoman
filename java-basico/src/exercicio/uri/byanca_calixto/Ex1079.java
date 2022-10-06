package exercicio.uri.byanca_calixto;

import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double X,Y,Z, mediaPonderada=0;

        for (int i=0;i<N;i++){
            X =sc.nextDouble();
            Y =sc.nextDouble();
            Z =sc.nextDouble();

            mediaPonderada = (X*2 + Y*3 + Z*5)/10;
            System.out.printf("%.1f%n",mediaPonderada);

        }

        sc.close();
    }
}
