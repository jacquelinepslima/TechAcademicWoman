package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1047 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hInicio = scan.nextInt();
        int mInicio = scan.nextInt();
        int hFinal = scan.nextInt();
        int mFinal = scan.nextInt();

        int tHoras = 0;
        int tMin = 0;


        if ((hFinal == hInicio) && (mFinal == mInicio)) {
            tHoras = 24;
            tMin = 0;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", tHoras, tMin);


        } else if ((hFinal > hInicio) && (mFinal > mInicio)) {
            tHoras = hFinal - hInicio;
            tMin = mFinal - mInicio;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", tHoras, tMin);

        } else if ((hFinal > hInicio) && (mFinal < mInicio)) {
            tHoras = 0;
            tMin = (60 - mInicio) + mFinal;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", tHoras, tMin);
        }
        scan.close();
    }
}

