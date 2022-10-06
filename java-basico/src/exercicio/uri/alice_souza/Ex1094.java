package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), Coelhos = 0, Sapos = 0, Ratos = 0;
        int Quantia;
        int Total = 0;
        char Tipo;

        for (int i=0; i<N; i++){
            Quantia = sc.nextInt();
            Tipo = sc.next().charAt(0);
            Total += Quantia;
            if (Tipo == 'C')
                Coelhos += Quantia;
            else if (Tipo == 'S')
                Sapos += Quantia;
            else if (Tipo == 'R')
                Ratos += Quantia;
            else System.out.println("Entrada invalida");
        }

        double percCoelhos = ((double)Coelhos/Total)*100.0;
        double percSapos = ((double)Sapos/Total)*100.0;
        double percRatos = ((double)Ratos/Total)*100.0;

        System.out.println("Total: " + Total + " cobaias");
        System.out.println("Total de coelhos: "+ Coelhos);
        System.out.println("Total de ratos: "+ Ratos);
        System.out.println("Total de sapos: "+ Sapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n", percRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n", percSapos);
        sc.close();
    }
}
