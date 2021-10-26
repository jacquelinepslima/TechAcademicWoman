package exercicio.uri.ana_caroline;

import java.util.Scanner;

public class Ex1016 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();

        int tempo = distancia * 2;
        /*
        * distancia * 2 porque no enunciado fala que o carro consegue se afastar 1 km
        * a cada dois minutos
        * */

        System.out.printf("%d minutos", tempo);
        sc.close();

    }
}
