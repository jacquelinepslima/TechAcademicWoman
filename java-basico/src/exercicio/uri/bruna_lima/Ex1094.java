package exercicio.uri.bruna_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n, quantia, total, totalC = 0, totalR = 0, totalS = 0;
        double percentC, percentR, percentS;
        char tipo;
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            quantia = sc.nextInt();
            tipo = sc.next().charAt(0);
            if (tipo == 'C'){
                totalC += quantia;
            } else if (tipo == 'R'){
                totalR += quantia;
            } else if(tipo == 'S') {
                totalS += quantia;
            }
        }

        total = totalC + totalR + totalS;
        percentC = (double)totalC/total;
        percentR = (double)totalR/total;
        percentS = (double)totalS/total;

        System.out.printf("Total: %d cobaias%n", total);
        System.out.printf("Total de coelhos: %d%n", totalC);
        System.out.printf("Total de ratos: %d%n", totalR);
        System.out.printf("Total de sapos: %s%n", totalS);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentC*100);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentR*100);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentS*100);

        sc.close();
    }
}
