package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1047 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horaIn, minIn, horaFin, minFin;
        int duracaohr = 0;
        int duracaomin = 0;


        horaIn = scanner.nextInt();
        minIn = scanner.nextInt();
        horaFin = scanner.nextInt();
        minFin = scanner.nextInt();


        duracaomin = minFin - minIn;

        if (horaFin != horaIn) {
            duracaohr = horaFin - horaIn;
        } else if (horaFin == horaIn && minFin == minIn) {
            duracaohr = 24;
        }

        if (duracaomin < 0) {
            duracaomin = 60 + duracaomin;
            duracaohr = duracaohr - 1;
        }

        if (duracaohr > 24) {
            System.out.println("Tempo inválido.");
        }

        if (duracaomin < 1) {
            System.out.println("Tempo inválido.");
        }

        System.out.println("O JOGO DUROU " + duracaohr + " HORA(S) E " + duracaomin + " MINUTO(S)." );

        scanner.close();
    }
}
