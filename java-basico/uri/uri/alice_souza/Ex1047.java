package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1047 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horaInicial = scan.nextInt();
        int minInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        int minFinal = scan.nextInt();
        int duracao = (horaFinal - horaInicial) * 60 + (minFinal - minInicial);
        int dHoras = duracao / 60;
        int dMin = duracao % 60;
        if((dHoras == 0)&& (dMin==0)) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", dHoras, dMin);
        }
        scan.close();
    }
}
