package exercicio.uri.giovanna_santana;

import java.util.Scanner;

public class Ex1001 {
    public static void main(String[] args) {
        //classe auxiliar para entrada de dados
        Scanner scanner = new Scanner(System.in);
        int A, B;

        //entrada de dados
        A = scanner.nextInt();
        B = scanner.nextInt();

        int X = A + B;

        System.out.println("X = " + X);

        // fechamento da classe auxiliar para entrada de dados
        scanner.close();
    }
}
