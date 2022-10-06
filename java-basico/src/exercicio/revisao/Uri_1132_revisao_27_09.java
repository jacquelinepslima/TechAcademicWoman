package exercicio.revisao;

import java.util.Locale;
import java.util.Scanner;

/*
                                    Múltiplos de 13

Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos
                    de 13 entre X e Y, incluindo ambos.

Entrada
O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.

Saída
Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada,
inclusive ambos se for o caso.

Exemplo de Entrada          |           Exemplo de Saída
200                                     13954
100

 */
public class Uri_1132_revisao_27_09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); // 200
        int y = scanner.nextInt(); // 100

        int menor = x;
        int maior = y;

        if (x > y) {
            menor = y;
            maior = x;
        }

        int soma = 0; // 100  101, 102.....198, 199, 200
        for (int i = menor; i <= maior; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
        scanner.close();

    }
}
