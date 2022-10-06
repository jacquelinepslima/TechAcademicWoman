package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {

    Scanner calculo = new Scanner(System.in);

    int a = calculo.nextInt();
    int b = calculo.nextInt();
    int c = calculo.nextInt();
    //
    int maior1 = (a+b+Math.abs(a-b))/2;
    int maior2 = (maior1+c+Math.abs(maior1-c))/2;

    System.out.printf("%d eh o maior", maior2);

    calculo.close();
    }
}
