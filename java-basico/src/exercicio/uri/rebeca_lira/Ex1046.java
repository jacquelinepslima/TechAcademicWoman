package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao = 0;

        if (horaInicial == horaFinal) {
            duracao = 24;
        }
        else if ((horaFinal-horaInicial) < 24){
            duracao = (horaFinal-horaInicial);
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
