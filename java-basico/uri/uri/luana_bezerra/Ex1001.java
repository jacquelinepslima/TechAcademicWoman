package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1001 {

    public static void main(String[] args) {
        // Clase auxiliar para entrada de dados
        Scanner scanner = new Scanner(System.in);

        int A;
        int B;

        A = scanner.nextInt();
        B = scanner.nextInt();

        int X = A + B;

        System.out.println("X = " + X);

        // Fechamento da Classe auxiliar para entrada de dados
        scanner.close();
    }
}
