package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex1020 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int entrada = leitor.nextInt ();
        int ano = 365;
        int mes = 30;

       int qtAno = entrada/ano;
       int qtAnoResto = entrada%ano;
       int qtMes = qtAnoResto/mes;
       int qtDias = qtAnoResto%mes;


        System.out.println(qtAno + " ano(s)");
        System.out.println(qtMes + " mes(ses)");
        System.out.println(qtDias + " dia(s)");



        leitor.close();
    }
}
