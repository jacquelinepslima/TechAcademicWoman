package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex1046 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicio = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        int duracao;

        if(horaFinal <= horaInicio)
            duracao = (24-horaInicio) + horaFinal;
        else duracao = horaFinal - horaInicio;

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        scanner.close();
    }
}
