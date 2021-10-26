package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1080 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n, maior = 0, posicao = 0;

        for(int i = 0; i < 100; i++) {
            n = entrada.nextInt();
            if(n > maior) {
                maior = n;
                posicao = i+1;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);
    }
}
