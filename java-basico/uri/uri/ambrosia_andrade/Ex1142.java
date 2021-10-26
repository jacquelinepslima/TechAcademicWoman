package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N, aux = 1;

        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println(aux + " " + (aux + 1) + " " + (aux + 2) + " PUM");
            aux+=4;
        }

        scanner.close();
    }
}
