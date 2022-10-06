package exercicio.revisao;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

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
public class Uri_1021_revisao_24_09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();
        int cedula100, cedula50, cedula20, cedula10, cedula5, cedula2, moeda1, moeda50, moeda25, moeda10, moeda5, moeda01;
        int restoDiv = (int) (N*100.0);

        cedula100 = restoDiv / 10000;
        restoDiv %= 10000;

        cedula50 = restoDiv / 5000;
        restoDiv %= 5000;

        cedula20 = restoDiv / 2000;
        restoDiv %= 2000;

        cedula10 = restoDiv / 1000;
        restoDiv %= 1000;

        cedula5 = restoDiv / 500;
        restoDiv %= 500;

        cedula2 = restoDiv / 200;
        restoDiv %= 200;

        moeda1 = restoDiv  / 100;
        restoDiv %= 100;

        moeda50 =restoDiv / 50;
        restoDiv  %= 50;

        moeda25 = restoDiv /25;
        restoDiv %= 25;

        moeda10 =restoDiv  / 10;
        restoDiv %= 10;

        moeda5 = restoDiv  / 5;
        restoDiv %= 5;

        moeda01 = restoDiv;

        // 5 nota(s) de R$ 100.00

        System.out.println("NOTAS: ");
        System.out.println(cedula100 + " nota(s) de R$ 100.00");
        System.out.println(cedula50 + " nota(s) de R$ 50.00");
        System.out.println(cedula20 + " nota(s) de R$ 20.00");
        System.out.println(cedula10 + " nota(s) de R$ 10.00");
        System.out.println(cedula5 + " nota(s) de R$ 5.00");
        System.out.println(cedula2 + " nota(s) de R$2.00");

        System.out.println("MOEDAS: ");
        System.out.println((int)moeda1 + " moeda(s) de R$ 1.00");
        System.out.println((int)moeda50 + " moeda(s) de R$ 0.50");
        System.out.println((int)moeda25 + " moeda(s) de R$ 0.25");
        System.out.println((int)moeda10 + " moeda(s) de R$ 0.10");
        System.out.println((int)moeda5 + " moeda(s) de R$ 0.05");
        System.out.println((int)moeda01 + " moeda(s) de R$ 0.01");

        sc.close();
    }
}