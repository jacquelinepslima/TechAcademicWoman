package exercicio.uri.paula_santos;

import java.util.Scanner;

public class Ex1153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int fatorial = N;

        for (int a = N; a > 1; a--) {
            fatorial = fatorial * (a - 1);
        }
        System.out.println(fatorial);
        scanner.close();
    }
}