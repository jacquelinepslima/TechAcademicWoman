package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();

        int diferenca = (a*b) - (c*d);

        System.out.println("DIFERENCA = " + diferenca);

        entrada.close();
    }
}
