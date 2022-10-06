package exercicio.uri.rebeca_lira;

import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int X = 60;
        int Y = 90;
        int dist, tempo;

        System.out.println("Qual é a distância em km?");
        dist = scanner.nextInt();

        tempo = dist * 2;

        System.out.println(tempo + " minutos.");

        scanner.close();

    }
}
