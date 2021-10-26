package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int horaInicial = entrada.nextInt();
        int horaFinal = entrada.nextInt();
        int totalHoras = 0;

        if(horaInicial >= horaFinal) {
            totalHoras = (24 - horaInicial) + horaFinal;
        }
        else {
            totalHoras = horaFinal - horaInicial;
        }
        System.out.println("O JOGO DUROU " + totalHoras + " HORA(S)");

        entrada.close();
    }
}
