package exercicio.uri.natasha_busnardo;

import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();

        int tempo = distancia * 2;

        System.out.printf("%d minutos",tempo);
    }
}
