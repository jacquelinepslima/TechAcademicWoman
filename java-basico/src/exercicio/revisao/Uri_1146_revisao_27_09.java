package exercicio.revisao;

import java.util.Locale;
import java.util.Scanner;

/*
                Sequências Crescentes
Este programa deve ler uma variável inteira X inúmeras vezes
(deve parar quando o valor no arquivo de entrada for igual a zero).
Para cada valor lido imprima a sequência de 1 até X, com um espaço entre cada número e seu sucessor.

Obs: cuide para não deixar espaço em branco após o último valor apresentado na linha ou você receberá Presentation Error.

Entrada
O arquivo de entrada contém vários números inteiros. O último número no arquivo de entrada é 0.

Saída
Para cada número N do arquivo de entrada deve ser impressa uma linha de 1 até N, conforme o exemplo abaixo.
Não deve haver espaço em branco após o último valor da linha.

Exemplo de Entrada          |           Exemplo de Saída
5                                       1 2 3 4 5
10                                      1 2 3 4 5 6 7 8 9 10
3                                       1 2 3
0
 */
public class Uri_1146_revisao_27_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        while (x != 0) {
            for (int i = 1; i < x; i++) {
                System.out.print(i + " ");
            }
            System.out.print(x);

            x = scanner.nextInt();
        }
        scanner.close();
    }
}
