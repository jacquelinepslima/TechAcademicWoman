package exercicio.uri.bruna_lima.util;

import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int soma = a + b;

        System.out.println("SOMA = " + soma);

        entrada.close();
    }
}
