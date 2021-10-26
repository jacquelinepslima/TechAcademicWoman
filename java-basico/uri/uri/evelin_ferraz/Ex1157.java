package exercicio.uri.evelin_ferraz;

import java.util.Scanner;

public class Ex1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        N = scanner.nextInt();

        for(int i = 1; i <= N; i++){
            if (N % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
