package exercicio.uri.luana_bezerra;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        int cedulas, moedas, divisao;


        // multiplicar valor por 100 e casting para int
        // 0.5 pra garantir a precisão do double
        // ou Math.round() -- ler sobre o método
        int restoDiv = (int) (valor * 100.0 + 0.5);

        System.out.println("NOTAS:");

        cedulas = 100;
        divisao = restoDiv / (cedulas * 100);

        System.out.println(divisao + " nota(s) de R$ " + cedulas + ".00");
        restoDiv = restoDiv % (cedulas * 100);


        cedulas = 50;
        divisao = restoDiv / (cedulas * 100);

        System.out.println(divisao + " nota(s) de R$ " + cedulas + ".00");
        restoDiv = restoDiv % (cedulas * 100);


        cedulas = 20;
        divisao = restoDiv / (cedulas * 100);

        System.out.println(divisao + " nota(s) de R$ " + cedulas + ".00");
        restoDiv = restoDiv % (cedulas * 100);


        cedulas = 10;
        divisao = restoDiv / (cedulas * 100);

        System.out.println(divisao + " nota(s) de R$ " + cedulas + ".00");
        restoDiv = restoDiv % (cedulas * 100);


        cedulas = 5;
        divisao = restoDiv / (cedulas * 100);

        System.out.println(divisao + " nota(s) de R$ " + cedulas + ".00");
        restoDiv = restoDiv % (cedulas * 100);


        cedulas = 2;
        divisao = restoDiv / (cedulas * 100);

        System.out.println(divisao + " nota(s) de R$ " + cedulas + ".00");
        restoDiv = restoDiv % (cedulas * 100);



        System.out.println("MOEDAS:");


        moedas = 100;
        divisao = restoDiv / moedas;

        System.out.println(divisao + " moedas(s) de R$ 1.00");
        restoDiv = restoDiv % moedas;


        moedas = 50;
        divisao = restoDiv / moedas;

        System.out.println(divisao + " moedas(s) de R$ 0.50");
        restoDiv = restoDiv % moedas;


        moedas = 25;
        divisao = restoDiv / moedas;

        System.out.println(divisao + " moedas(s) de R$ 0.25");
        restoDiv = restoDiv % moedas;


        moedas = 10;
        divisao = restoDiv / moedas;

        System.out.println(divisao + " moedas(s) de R$ 0.10");
        restoDiv = restoDiv % moedas;


        moedas = 5;
        divisao = restoDiv / moedas;

        System.out.println(divisao + " moedas(s) de R$ 0.05");
        restoDiv = restoDiv % moedas;


        moedas = 1;
        divisao = restoDiv / moedas;

        System.out.println(divisao + " moedas(s) de R$ 0.01");
        restoDiv = restoDiv % moedas;


        sc.close();
    }
}
