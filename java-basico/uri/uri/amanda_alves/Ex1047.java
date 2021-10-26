package exercicio.uri.amanda_alves;

import java.util.Scanner;

public class Ex1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minFinal = sc.nextInt();


        int horaTotal = horaFinal - horaInicial;
        int minTotal = minFinal - minInicial;

        if (horaTotal < 0) {
            horaTotal = 24 + horaTotal;
        }

        if (minTotal < 0) {
            minTotal = 60 + minTotal;
        }

        if (horaFinal == horaInicial && minFinal == minInicial){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", horaTotal, minTotal);
        }

        sc.close();
    }
}
