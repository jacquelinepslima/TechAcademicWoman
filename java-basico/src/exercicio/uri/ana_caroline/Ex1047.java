package exercicio.uri.ana_caroline;

import java.util.Scanner;

public class Ex1047 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minFinal = sc.nextInt();

        int totHoras = 0;
        int totMin = 0;

        if(horaFinal == horaInicial && minFinal == minInicial){
            totHoras = 24;
            totMin = 0;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", totHoras, totMin);


        } else if (horaFinal > horaInicial && minFinal > minInicial){
            totHoras = horaFinal - horaInicial;
            totMin = minFinal - minInicial;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", totHoras, totMin);

        } else if (horaFinal > horaInicial && minFinal < minInicial){
            totHoras = 0;
            totMin = (60 - minInicial) + minFinal;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", totHoras, totMin);

        }




        sc.close();
    }
}
