package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1046 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracaoJogo;

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        duracaoJogo = 24 - (24 + horaInicial - horaFinal) % 24;

        if (horaInicial == horaFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)", duracaoJogo);
        }

        sc.close();
    }
}