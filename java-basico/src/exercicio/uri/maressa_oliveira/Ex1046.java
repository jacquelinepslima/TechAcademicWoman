package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hinicio, hfim, totalHoras;

        hinicio = scanner.nextInt();
        hfim = scanner.nextInt();

        totalHoras=hfim-hinicio;

        if (totalHoras<=0){
            totalHoras+=24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)",totalHoras);
        scanner.close();
    }
}
