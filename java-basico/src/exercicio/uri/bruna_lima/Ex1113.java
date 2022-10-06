package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1113 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();
        int y = entrada.nextInt();

        while(x != y) {

            if(x < y)
                System.out.println("Crescente");
            else
                System.out.println("Decrescente");

            x = entrada.nextInt();
            y = entrada.nextInt();

            entrada.close();
        }
    }
}
