package exercicio.revisao;

import java.net.SecureCacheResponse;
import java.util.Locale;
import java.util.Scanner;

/*
                    Dividindo X por Y

Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível
mostre a mensagem “divisao impossivel” para os valores em questão.

Entrada
A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y)
que serão lidos em seguida.

Saída
Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso
não seja possível efetuar o cálculo.

Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)

Exemplo de Entrada          |           Exemplo de Saída
3
3 -2                                    -1.5
-8 0                                    divisao impossivel
0 8                                     0.0
 */
public class Uri_1116_revisao_27_09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();


            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double restoDivisao = (double) x / y;
                System.out.printf("%.1f%n", restoDivisao);
            }
        }

        scanner.close();
    }
}
