package exercicio.uri.ana_melo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n, x, y;
        double divisao;
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            if (y == 0){
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f%n",(double)x/y);
            }
        }

        sc.close();
    }
}
