package exercicio.uri.palloma_soares;

import java.util.Scanner;

public class Ex1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, minInicial, horaFinal, minFinal;
        int contHora, contMin = 0;

        horaInicial = sc.nextInt();
        minInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        minFinal = sc.nextInt();

        int convertMinInicial = horaInicial * 60 + minInicial;
        int convertMinFinal = horaFinal * 60 + minFinal;

        if(convertMinFinal == convertMinInicial){
            contHora = 24;
        }
        else if(convertMinFinal > convertMinInicial){
            contMin = convertMinFinal - convertMinInicial;
            contHora = contMin/60;
            contMin = contMin%60;
        }
        else{
            contMin = 1440 - convertMinInicial + convertMinFinal;
            contHora = contMin/60;
            contMin = contMin%60;
        }

        System.out.println("O JOGO DUROU "+contHora+" HORA(S) E "+contMin+" MINUTO(S)");

        sc.close();
    }
}
