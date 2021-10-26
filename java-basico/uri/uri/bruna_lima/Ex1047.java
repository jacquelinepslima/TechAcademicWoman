package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1047 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int horaInicial = entrada.nextInt();
        int minutoInicial = entrada.nextInt();
        int horaFinal = entrada.nextInt();
        int minutoFinal = entrada.nextInt();

        int horaInicio = horaInicial*60 + minutoInicial;
        int hFinal = horaFinal*60 + minutoFinal;
        int duracao = 0;
        int aux = 0;
        int aux2 = 0;

        if(horaInicial <= hFinal){
            duracao = hFinal - horaInicio;
            if(duracao == 0) {
                aux = duracao % 60;
                System.out.printf("O JOGO DUROU 24 HORA(S) E %d MINUTO(S)%n", aux);
            }
            else {
                aux = duracao % 60;
                aux2 = (duracao - duracao % 60) / 60;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", aux2, aux);
            }
        }
        else{
            duracao = (24*60 - horaInicio) + hFinal;
            aux = duracao % 60;
            aux2 = (duracao - duracao%60)/60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", aux2, aux);
        }
    }
}
