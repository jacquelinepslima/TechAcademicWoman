package exercicio.uri.ana_caroline;

import java.util.Scanner;

public class Ex1046 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int termino = sc.nextInt();
        int duracao;

        if(inicio > termino){
            duracao = (24 - inicio) + termino;
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);

        } else if(inicio < termino){
            duracao = termino - inicio;
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);

        }else if (inicio == termino){
            duracao = 24;
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        }


        sc.close();
    }
}
