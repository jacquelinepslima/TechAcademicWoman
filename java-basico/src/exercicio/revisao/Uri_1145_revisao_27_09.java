package exercicio.revisao;
/*
                    Sequência Lógica 2

Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y,
passando para a próxima linha a cada X números.

Entrada
O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

Saída
Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, conforme exemplo abaixo.
Não deve haver espaço em branco após o último valor da linha.

Exemplo de Entrada          |           Exemplo de Saída
3 99                                    1 2 3
                                        4 5 6
                                        7 8 9
                                        10 11 12
                                        ...
                                        97 98 99
 */

import java.util.Locale;
import java.util.Scanner;

public class Uri_1145_revisao_27_09 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for (int i = 1; i <= y; i++) {
            System.out.print(i);

            if(i % x == 0){
                System.out.println();
            }else{
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}
