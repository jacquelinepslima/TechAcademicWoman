package exercicio.uri.maressa_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1094 {
    public static <Char> void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        for (int i = 0; i < n; i++) {
            int quantia = sc.nextInt();
            String tipo = sc.next();
            if (tipo.equalsIgnoreCase("C")) {
                coelhos += quantia;
            } else if (tipo.equalsIgnoreCase("R")) {
                ratos += quantia;
            } else if (tipo.equalsIgnoreCase("S")) {
                sapos += quantia;
            } else {
                System.out.println("Não é uma cobaia!");
            }

            int totalCobais = coelhos + ratos + sapos;

            System.out.println("Total: " + totalCobais + " cobaias");
            System.out.println("Total de coelhos: " + coelhos);
            System.out.println("Total de ratos: " + ratos);
            System.out.println("Total de sapos: " + sapos);

            double percentualCoelhos = (double) (coelhos * 100) / totalCobais;
            double percentualRatos = (double) (ratos * 100) / totalCobais;
            double percentualSapos = (double) (sapos * 100) / totalCobais;

            System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
            System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
            System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos);

            sc.close();
        }
    }
}


