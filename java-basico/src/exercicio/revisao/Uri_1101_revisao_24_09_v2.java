package exercicio.revisao;

import java.util.Scanner;

/*
Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero).
Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

Entrada
O arquivo de entrada contém um número não determinado de valores M e N.
A última linha de entrada vai conter um número nulo ou negativo.

Saída
Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.

Exemplo de Entrada
5 2
6 3
5 0

2 3 4 5 Sum=14
3 4 5 6 Sum=18
 */


public class Uri_1101_revisao_24_09_v2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        while(m > 0 && n > 0){
            int menor = m;
            int maior = n;

            if (m > n){
                menor = n;
                maior = m;
            }
            int soma = 0;

            for(int i = menor; i <= maior; i++){
                soma += i;
                System.out.print(i + " ");
            }
            System.out.println("Sum=" + soma);
            m = sc.nextInt();
            n = sc.nextInt();

        }

        sc.close();
    }
}
