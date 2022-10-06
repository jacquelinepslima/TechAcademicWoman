package exercicio.revisao;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1021_resolucao_alicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N = 91.01 ;//sc.nextDouble();
        int notas, moeda, resto, quociente;

        /*
        Multiplicar N por 100 e casting para int.
        Ex:
            576.73 * 100
                57673 + 0.5
         */

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
}
