package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1146 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x = 1;

        while(x > 0 && x != 0) {

            x = entrada.nextInt();

            for(int i = 1; i <= x; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
