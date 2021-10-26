package exercicio.uri.evelin_ferraz;

import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio = scanner.nextInt();
        int fim = scanner.nextInt();
        int duracao = 0;

        if (fim > inicio){
            duracao = fim - inicio;        }
        else if (fim == inicio){
            duracao = 24;
        }
        else{
            duracao = (24 - inicio) + fim;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        scanner.close();
    }
}
