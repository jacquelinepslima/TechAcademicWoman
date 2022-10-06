package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args){
        double raio, pi = 3.14159, calculo;

        Scanner scanner = new Scanner(System.in);
        raio = scanner.nextDouble();

        calculo = (4/3.0) * pi * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f", calculo);

        scanner.close();
    }
}
