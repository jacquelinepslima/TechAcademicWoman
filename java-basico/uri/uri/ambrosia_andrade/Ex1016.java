package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args){
        int distancia, tempo;

        Scanner scanner = new Scanner(System.in);

        distancia = scanner.nextInt();

        tempo = distancia * 2;

        System.out.printf("%d minutos", tempo);

        scanner.close();
    }
}
