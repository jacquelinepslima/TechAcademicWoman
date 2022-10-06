package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();
        int tempoNec = distancia * 2;

        System.out.printf("%d minutos", tempoNec);
        System.out.println();

        sc.close();
    }
}