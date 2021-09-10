package exercicio.uri.jacque_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1094 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int quantia = 0;
        int qtdCoelhos = 0, qtdRatos = 0, qtdSapos = 0, qtdTotal = 0;

        double percentCoelho = 0, percentRato = 0, percentSapo = 0;

        for (int i = 0; i < N; i ++) {
            quantia = sc.nextInt();
            char tipoCobaia = sc.next().toUpperCase().charAt(0);
            qtdTotal += quantia;

            switch (tipoCobaia) {

                case 'C':
                    qtdCoelhos += quantia;
                    break;
                case 'R':
                    qtdRatos += quantia;
                    break;
                case 'S':
                    qtdSapos += quantia;
                    break;
                default:
                    System.out.println("Cobaia invalido");
            }

            percentCoelho = ((double) (qtdCoelhos * 100.00) / qtdTotal);
            percentRato = ((double) (qtdRatos * 100.00) / qtdTotal);
            percentSapo = ((double) (qtdSapos * 100.00) / qtdTotal);
        }

        System.out.println("Total: " + qtdTotal + " cobais");
        System.out.println("Total de coelhos: " + qtdCoelhos);
        System.out.println("Total de ratos: " + qtdRatos);
        System.out.println("Total de sapos: " + qtdSapos);


        System.out.printf("Percentual de coelhos: %.2f%%%n", percentCoelho);
        System.out.printf("Percentual de ratos: %.2f%%%n", percentRato);
        System.out.printf("Percentual de sapos: %.2f%%", percentSapo);

        sc.close();
    }
}
