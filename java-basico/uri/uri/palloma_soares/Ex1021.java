package exercicio.uri.palloma_soares;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();
        double restoDiv, restoDiv1, restoDiv2, restoDiv3, restoDiv4, restoDiv5;
        int cedula100, cedula50, cedula20, cedula10, cedula5, cedula2;
        int moeda1, moeda50, moeda25, moeda10, moeda05, moeda01;
        double restoDiv6, restoDiv7, restoDiv8, restoDiv9, restoDiv10;

        cedula100 = (int) N / 100;
        restoDiv = N % 100;

        cedula50 = (int) restoDiv / 50;
        restoDiv1 = restoDiv % 50;

        cedula20 = (int) restoDiv1 / 20;
        restoDiv2 = restoDiv1 % 20;

        cedula10 = (int) restoDiv2 / 10;
        restoDiv3 = restoDiv2 % 10;

        cedula5 = (int) restoDiv3 / 5;
        restoDiv4 = restoDiv3 % 5;

        cedula2 = (int) restoDiv4 / 2;
        restoDiv5 = restoDiv4 % 2;

        moeda1 = (int) (restoDiv5);
        restoDiv6 =  restoDiv5 % 1.00;

        moeda50 = (int) (restoDiv6 / 0.50);
        restoDiv7 = restoDiv6 % 0.50;

        moeda25 = (int) (restoDiv7 / 0.25);
        restoDiv8 = restoDiv7 % 0.25;

        moeda10 = (int) (restoDiv8 / 0.10);
        restoDiv9 = restoDiv8 % 0.10;

        moeda05 = (int) (restoDiv9 / 0.05);
        restoDiv10 = restoDiv9 % 0.05;

        moeda01 = (int) (restoDiv10 / 0.01);


        System.out.println("NOTAS:");
        System.out.println(cedula100 + " nota(s) de R$ 100,00");
        System.out.println(cedula50 + " nota(s) de R$ 50,00");
        System.out.println(cedula20 + " nota(s) de R$ 20,00");
        System.out.println(cedula10 + " nota(s) de R$ 10,00");
        System.out.println(cedula5 + " nota(s) de R$ 5,00");
        System.out.println(cedula2 + " nota(s) de R$ 2,00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1,00");
        System.out.println(moeda50 + " moeda(s) de R$ 0,50");
        System.out.println(moeda25 + " moeda(s) de R$ 0,25");
        System.out.println(moeda10 + " moeda(s) de R$ 0,10");
        System.out.println(moeda05 + " moeda(s) de R$ 0,05");
        System.out.println(moeda01 + " moeda(s) de R$ 0,01");

        sc.close();
    }
}

/*        RESOLUCAO PROFESSOR

        package exercicio.revisao;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;


Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o
menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20,
10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

        public class Uri_1021_revisao_24_09 {
            public static void main(String[] args) {

                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                double N = 576.73 ;//sc.nextDouble();
                int notas, moeda, resto, quociente;


        Multiplicar N por 100 e casting para int.
        Ex:
            576.73 * 100
                57673 + 0.5


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
                System.out.println(quociente + " modea de R$ 1.00");
                resto = resto % moeda;

                moeda = 50;
                quociente = resto / moeda;
                System.out.println(quociente + " modea de R$ 0.50");
                resto = resto % moeda;

                moeda = 25;
                quociente = resto / moeda;
                System.out.println(quociente + " modea de R$ 0.25");
                resto = resto % moeda;

                moeda = 10;
                quociente = resto / moeda;
                System.out.println(quociente + " modea de R$ 0.10");
                resto = resto % moeda;

                moeda = 5;
                quociente = resto / moeda;
                System.out.println(quociente + " modea de R$ 0.05");

                resto = resto % moeda;

                System.out.println(resto + " modea de R$ 0.01");
                sc.close();
            }
        } */

