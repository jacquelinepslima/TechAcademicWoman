package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1144 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int linha = 1; linha <= N; linha++) {
            System.out.println(linha + " " + (linha*linha) + " " + (linha*linha*linha));
            System.out.println(linha + " " + ((linha*linha)+1) + " " + ((linha*linha*linha)+1));
        }

        scanner.close();
    }
}
