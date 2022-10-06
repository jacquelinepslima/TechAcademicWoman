package exercicio.uri.samyra_figueiredo;

import java.util.Scanner;

public class Ex1016 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int distancia, tempo;

        distancia = sc.nextInt();

        tempo = (distancia * 2);

        System.out.println(tempo + " minutos");

        sc.close();
    }
}
