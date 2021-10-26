package exercicio.uri.evelin_ferraz;

import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N, X, in = 0, out = 0;

        N = scanner.nextInt();

        while (N > 0){
            X = scanner.nextInt();
            if ((X >= 10) && (X <= 20)){
                in++;
            } else {
                out++;
            }
            N--;
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        scanner.close();
    }
}
