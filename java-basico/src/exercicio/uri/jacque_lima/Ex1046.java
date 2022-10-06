package exercicio.uri.jacque_lima;

import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int horaFinal = sc.nextInt();
        int total;

        if(horaInicio < horaFinal){
            total = horaFinal - horaInicio;
        }else if(horaInicio > horaFinal){
            total = 24 - (horaInicio - horaFinal);
        }else{
            total = 24 - (horaInicio + horaFinal);
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", total);

        sc.close();
    }
}
