package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double n1, n2, n3, mediaPond;

        for (int i=0; i<N; i++){
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();
            mediaPond = 0.2*n1 + 0.3*n2 + 0.5*n3;
            System.out.printf("%.1f%n",mediaPond);
        }
        sc.close();
    }
}
