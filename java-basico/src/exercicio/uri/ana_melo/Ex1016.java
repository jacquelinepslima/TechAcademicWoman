package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();
        int minutos = distancia * 2;

        System.out.printf("%d minutos", minutos);

        sc.close();
    }
}
