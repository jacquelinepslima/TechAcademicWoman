package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1001 {
    public static void main(String[] args) {
        // classe auxiliar para entrada de dados
        Scanner scanner = new Scanner(System.in);
        int a, b;

        // entrada de dados
        a = scanner.nextInt();
        b = scanner.nextInt();

        int x = a + b;
        // ln é para quebra de linha
        System.out.println("X = " + x);

        scanner.close();
    }
}
