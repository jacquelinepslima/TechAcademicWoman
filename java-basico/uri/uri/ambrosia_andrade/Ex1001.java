package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1001 {
    public static void main(String[] args){
        // Classe auxiliar para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int A, B;

        A = scanner.nextInt();
        B = scanner.nextInt();

        // Criando e atribuindo a soma
        int X = A + B;

        System.out.println("X = " + X);

        // Fechamento da Classe auxiliar para a entrada de dados
        scanner.close();
    }
}
