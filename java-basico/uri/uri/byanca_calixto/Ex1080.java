package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex1080 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int posicao = 0;

        for (int i = 1; i <=100; i++){
            int N = sc.nextInt();
            if (N > maior){
                maior = N;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
        sc.close();

    }
}
