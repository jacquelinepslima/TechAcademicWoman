package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1158 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int x, y, soma = 0;

        while(n >= 0) {

            x = entrada.nextInt();
            y = entrada.nextInt();

            for(int i = x, j = 0; j < y ; i++) {
                if(i % 2 != 0) {
                    j++;
                    soma += i;
                }
            }
            System.out.println(soma);
            soma = 0;
        }
    }
}
