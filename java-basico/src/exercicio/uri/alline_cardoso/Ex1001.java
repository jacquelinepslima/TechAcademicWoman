package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1001 {
    public static void main(String[] args) {

        //classe auxiliar para entrada de dados
        Scanner scanner = new Scanner(System.in);

        //declaração das variáveis
        int A;
        int B;

        //entrada de dados (setando os valores nas variaveis)
        A = scanner.nextInt();
        B = scanner.nextInt();

        int X = A + B;

        System.out.println("X = " + X);

        //Fechamento da Classe auxiliar para entrada de dado
        scanner.close();
    }
}
