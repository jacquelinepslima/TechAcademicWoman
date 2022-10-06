package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int totalHoras = 0;

        if (horaInicial>horaFinal){
            totalHoras = (24 - horaInicial) + horaFinal;
            System.out.printf("O JOGO DUROU %d HORA(S)",totalHoras);
        }
        else if (horaFinal==horaInicial){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else if (horaInicial<horaFinal){
            totalHoras = horaFinal - horaInicial;
            System.out.printf("O JOGO DUROU %d HORA(S)", totalHoras);
        }

        scanner.close();
    }
}
