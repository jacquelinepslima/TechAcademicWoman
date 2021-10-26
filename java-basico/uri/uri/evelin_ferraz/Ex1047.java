package exercicio.uri.evelin_ferraz;

import java.util.Scanner;

public class Ex1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  hInicial, mInicial, hFinal, mFinal, totalHoras, totalMinutos, minutos, horas;

        hInicial = scanner.nextInt();
        mInicial = scanner.nextInt();
        hFinal = scanner.nextInt();
        mFinal = scanner.nextInt();

        totalHoras = (hFinal * 60) - (hInicial * 60);
        totalMinutos = mFinal- mInicial;

        horas = (totalHoras + totalMinutos) / 60;
        minutos = (totalMinutos + totalHoras) % 60;

        if (hInicial == hFinal && mInicial == mFinal){
            System.out.println("O JOGO DUROU 24 HORAS(S) E 0 MINUTO(S)");
        } else {
            System.out.printf("O JOGO DUROU %d HORAS(S) E %d MINUTO(S)",horas, minutos);
        }

        scanner.close();
    }
}
