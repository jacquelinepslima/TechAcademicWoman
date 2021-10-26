package exercicio.uri.jacque_lima;

import java.util.Scanner;

public class Ex1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minFinal = sc.nextInt();

        int T = 0;
        int M = 0;

        if ((horaFinal == horaInicial) && (minFinal == minInicial)){
            T = 24;
            M = 0;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", T, M);
        }else if((horaFinal > horaInicial) && (minFinal > minInicial)){
            T = horaFinal - horaInicial;
            M = minFinal - minInicial;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", T, M);
        }else if((horaFinal > horaInicial) && (minFinal < minInicial)){
            T = 0;
            M = (60 - minInicial) + minFinal;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", T, M);
        }
        sc.close();
    }
}
