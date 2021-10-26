package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int hora, minutos, segundos, restoDivisao;

        hora = N / 3600;
        restoDivisao = N % 3600;

        minutos = restoDivisao / 60;
        segundos = restoDivisao % 60;

        System.out.println(hora + ":" + minutos + ":" + segundos);

        scanner.close();
    }
}
