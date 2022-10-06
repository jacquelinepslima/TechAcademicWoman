package exercicio.revisao;


/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o
menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20,
10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
 */

import java.util.Locale;
import java.util.Scanner;

public class Uri_1021_revisao_24_09_alicio {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();
        int notas, moeda, resto, quociente;

        /*
        Multiplicar N por 10091 e casting para int.
        Ex:
            576.73 * 100
                57673 + 0.5
         */
        //
        resto = (int) (N * 100.0 + 0.5);

        System.out.println("notas: ");

        notas = 100;
        quociente = resto / (notas * 100);

        System.out.println(quociente + " nota(s) de R$ " + notas + ".00");
        resto = resto % (notas * 100);


        notas = 50;
        quociente = resto / (notas * 100);

        System.out.println(quociente + " nota(s) de R$ " + notas + ".00");
        resto = resto % (notas * 100);

        notas = 20;
        quociente = resto / (notas * 100);

        System.out.println(quociente + " nota(s) de R$ " + notas + ".00");
        resto = resto % (notas * 100);

        notas = 10;
        quociente = resto / (notas * 100);

        System.out.println(quociente + " nota(s) de R$ " + notas + ".00");
        resto = resto % (notas * 100);

        notas = 5;
        quociente = resto / (notas * 100);

        System.out.println(quociente + " nota(s) de R$ " + notas + ".00");
        resto = resto % (notas * 100);

        notas = 2;
        quociente = resto / (notas * 100);

        System.out.println(quociente + " nota(s) de R$ " + notas + ".00");
        resto = resto % (notas * 100);


        System.out.println("moedas: ");

        moeda = 100;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda de R$ 1.00");
        resto = resto % moeda;

        moeda = 50;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda de R$ 0.50");
        resto = resto % moeda;

        moeda = 25;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda de R$ 0.25");
        resto = resto % moeda;

        moeda = 10;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda de R$ 0.10");
        resto = resto % moeda;

        moeda = 5;
        quociente = resto / moeda;
        System.out.println(quociente + " moeda de R$ 0.05");

        resto = resto % moeda;

        System.out.println(resto + " moeda de R$ 0.01");
        sc.close();
    }
}
