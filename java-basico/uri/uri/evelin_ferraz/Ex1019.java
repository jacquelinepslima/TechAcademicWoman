package exercicio.uri;

import java.util.Locale;
import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int N = scanner.nextInt();


        //Converter um número inteiro em Horas OPERADOR MOD -> % (resto da divisão)
        int hr, min, seg, restoDivisao;

        hr = N / 3600; //qtd de segundos em uma hora
        restoDivisao = N % 3600;

        min = restoDivisao / 60;
        seg = restoDivisao % 60;

        System.out.println(hr + ": " + min + " : " + seg);
        System.out.println(restoDivisao);
        scanner.close();

    }
}
