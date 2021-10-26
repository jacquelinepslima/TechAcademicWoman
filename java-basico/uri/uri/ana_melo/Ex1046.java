package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if(horaFinal == horaInicial){
            duracao = 24;
        }
        else if(horaFinal < horaInicial){
            duracao = horaFinal + (24 - horaInicial);
        }
        else{
            duracao = horaFinal - horaInicial;
        }

        System.out.println("O jogo durou "+duracao+" hora(s)");

        sc.close();
    }
}
