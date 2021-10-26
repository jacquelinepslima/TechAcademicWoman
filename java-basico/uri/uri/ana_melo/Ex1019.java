package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {

        //operador MOD % -> resto da divisao
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int horas, minutos, segundos, restoDivisao;

        horas = n / 3600;
        restoDivisao = n % 3600;

        minutos = restoDivisao / 60;
        segundos = restoDivisao % 60;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

        sc.close();
    }
}
