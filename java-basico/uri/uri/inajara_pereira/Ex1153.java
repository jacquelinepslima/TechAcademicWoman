package exercicio.uri.inajara_pereira;

import java.util.Scanner;

public class Ex1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fatorial = n * (n - 1) * (n - 2) * (n - 3);

//        int fatorial = 1;
//        for (int i = 1; i <= n; i++) {
//            fatorial = fatorial * i;
//        }
        System.out.println(fatorial);
        sc.close();
    }
}
