package exercicio.revisao;

/*
       * Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
        Entrada
        O arquivo de entrada contém 100 números inteiros, positivos e distintos.
        Saída
        Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.*/


import java.util.Scanner;

public class Uri_1080_revisao_24_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int N ;
        int maior = 0;
        int posicao = 0;

        for (int i = 1; i <= 5; i++ ){
            N = scanner.nextInt();
            if (N > maior){
                maior = N;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
        
        scanner.close();

    }
}
