package exercicio.uri.luana_bezerra;

import java.util.Locale;
import java.util.Scanner;

public class Ex1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner laboratorio = new Scanner(System.in);

        int N = laboratorio.nextInt();
        int x;
        int Quantia;
        double QuantiaTotal = 0;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;
        char Tipo;

        for(x = 0; x < N; x++) {

            Quantia = laboratorio.nextInt();
            Tipo = laboratorio.next().charAt(0);

            if((Quantia >= 1) && (Quantia <= 15)) {
                QuantiaTotal += Quantia;

                if (Tipo == 'C') {
                    coelhos += Quantia;
                } else if (Tipo == 'R') {
                    ratos += Quantia;
                } else if (Tipo == 'S') {
                    sapos += Quantia;
                }
            }

        }

        double percentualCoelhos = (coelhos / QuantiaTotal) * 100.0;
        double percentualRatos = (ratos / QuantiaTotal) * 100.0;
        double percentualSapos = (sapos / QuantiaTotal) * 100.0;

        System.out.printf("Total: %.0f cobaias %n", QuantiaTotal);
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: "+ sapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos);

        laboratorio.close();
    }
}
