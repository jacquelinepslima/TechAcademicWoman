package exercicio.uri.rebeca_lira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        int quantidadeCasos = scanner.nextInt();

        int quantidadeCoelho = 0;
        int quantidadeRato = 0;
        int quantidadeSapo = 0;
        int quantidadeCobaia;
        int quantidadeCobaiaTotal = 0;

        for (int i = 0; i < quantidadeCasos; i++) {
            quantidadeCobaia = scanner.nextInt();
            String tipoCobaia = scanner.next();
            switch (tipoCobaia) {
                case "C":
                    quantidadeCoelho += quantidadeCobaia;
                    break;
                case "R":
                    quantidadeRato += quantidadeCobaia;
                    break;
                case "S":
                    quantidadeSapo +=quantidadeCobaia;
                    break;
            }
            quantidadeCobaiaTotal += quantidadeCobaia;
        }

        double percentualCoelho = (((double) quantidadeCoelho / quantidadeCobaiaTotal) * 100);
        double percentualRato = (((double) quantidadeRato / quantidadeCobaiaTotal) * 100);
        double percentualSapo = (((double) quantidadeSapo / quantidadeCobaiaTotal) * 100);

        System.out.println("Total: " + quantidadeCobaiaTotal + " cobaias");
        System.out.println("Total de coelhos: " + quantidadeCoelho);
        System.out.println("Total de ratos: " + quantidadeRato);
        System.out.println("Total de sapos: " + quantidadeSapo);

        System.out.printf("Percentual de coelhos: %2.2f  %%%n", percentualCoelho);
        System.out.printf("Percentual de ratos: %2.2f  %%%n", percentualRato);
        System.out.printf("Percentual de sapos: %2.2f  %%%n", percentualSapo);

    }
}
