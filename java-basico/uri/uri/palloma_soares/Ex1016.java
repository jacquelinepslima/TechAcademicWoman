package exercicio.uri.palloma_soares;

import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int distanciaY = sc.nextInt();

        int calculoMinutos = distanciaY * 2;

        System.out.println(calculoMinutos+" minutos");

        sc.close();
    }
}
