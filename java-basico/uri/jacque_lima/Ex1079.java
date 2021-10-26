package exercicio.uri.jacque_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            double N1 = sc.nextDouble();
            double N2 = sc.nextDouble();
            double N3 = sc.nextDouble();
            double media = ((N1 * 2) + (N2 * 3) + (N3 * 5)) / 10;
            System.out.printf("%.1f", media);
        }

        sc.close();
    }
}
