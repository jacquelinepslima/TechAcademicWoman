package exercicio.uri.alicio_cunha;

import java.util.Scanner;

public class Ex1001 {

    public static void main(String[] args) {
        // Classe auxiliar para entrada de dado
        Scanner scanner = new Scanner(System.in);

        // declaracao das variaveis
        int A;
        int B;

        //entrada de dados (setando os valores nas variaveis)
        A = scanner.nextInt();
        B = scanner.nextInt();

        int X = A + B;

        System.out.println("X = " + X);

        // Fechamento da Classe auxiliar para entrada de dado
        scanner.close();
    }
}
