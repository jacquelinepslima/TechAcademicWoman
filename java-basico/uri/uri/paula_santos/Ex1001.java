package exercicio.uri.paula_santos;

import java.util.Scanner;

public class Ex1001 {
    public static void main(String[] args) {
        //classe auxiliar para entrada de dados
        Scanner scanner = new Scanner(System.in);
        //declaracao das variaveis
        int A,B;

        //entrada de dados(setando valores nas variaveis)
        A = scanner.nextInt();
        B = scanner.nextInt();

        int X = A + B;

        System.out.println("X = "+X);

        scanner.close();
    }
}
