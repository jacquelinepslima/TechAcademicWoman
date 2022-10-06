package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horas, minutos, segundos, restoDivisao;
        int N = scan.nextInt();
        horas = N / 3600;
        restoDivisao = N % 3600;

        minutos = restoDivisao /60;
        segundos = restoDivisao %60;

        System.out.println( horas + ":" + minutos + ":" + segundos);
        scan.close();
    }
}
