package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        int x = entrada.nextInt();
        int y = entrada.nextInt();

        if(x > y) {
            int aux = y;
            y = x;
            x = aux;
        }

        for(int i = x; i <= y; i++) {
            if(i % 13 != 0)
                soma += i;
        }
        System.out.println(soma);
    }
}
