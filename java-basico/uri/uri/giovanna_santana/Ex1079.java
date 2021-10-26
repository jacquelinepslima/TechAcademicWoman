package exercicio.uri.giovanna_santana;

import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double X1, X2, X3;
        double media;



        for (int i = 0;  i < N;  i++){
            X1 = sc.nextDouble();
            X2 = sc.nextDouble();
            X3 = sc.nextDouble();

            media = ((X1*2) + (X2*3) + (X3*5)) / 10;

            System.out.printf("%.1f", media);
        }

        sc.close();
    }
}
