package exercicio.uri.amanda_alves;

import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempoIncio = sc.nextInt();
        int tempoFim = sc.nextInt();
        int duracao;

        if (tempoIncio > tempoFim) {
            duracao = 24 - (tempoIncio - tempoFim);
            System.out.printf("O JOGO DUROU %d HORAS", duracao);
        } else if (tempoFim > tempoIncio) {
            duracao = tempoFim - tempoIncio;
            System.out.printf("O JOGO DUROU %d HORAS", duracao);
        } else {
            System.out.printf("O JOGO DUROU 24 HORAS");

        }

    }
}
