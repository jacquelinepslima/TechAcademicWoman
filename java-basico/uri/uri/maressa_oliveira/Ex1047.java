package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex1047 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int horasInicio = scan.nextInt();
        int minutosInicio = scan.nextInt();

        int horasFinal = scan.nextInt();
        int minutosFinal = scan.nextInt();

        int totalMinutos = minutosFinal - minutosInicio;
        int totalHoras = horasFinal - horasInicio;

        if (totalHoras <= 0) {
            totalHoras += 24;
        }

        if(totalMinutos < 0){
            totalHoras --;
            totalMinutos +=60;
        }

        System.out.println("O JOGO DUROU " + totalHoras  + " HORA(S) " + totalMinutos + " MINUTOS");


        scan.close();
    }
}
