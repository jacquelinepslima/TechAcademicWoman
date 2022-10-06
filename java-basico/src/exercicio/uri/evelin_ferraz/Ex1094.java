package exercicio.uri.evelin_ferraz;

import java.util.Locale;
import java.util.Scanner;

public class Ex1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double perCoelhos, perRatos, perSapos;
        int num, totCoelhos=0, totRatos=0,totSapos=0, totCobaias;

        for(int i = 1; i <= 5; i++){
            num = sc.nextInt();
            char tipo = sc.next().charAt(0);

            switch (tipo){
                case 'C': totCoelhos += num;
                    break;
                case 'R': totRatos += num;
                    break;
                case 'S': totSapos += num;
                    break;
                default:
                    System.out.println("Insira um animal válido!");
            }
        }

        totCobaias = totCoelhos + totRatos + totSapos;

        perCoelhos = (totCoelhos / (double) totCobaias) * 100;
        perRatos =  (totRatos / (double) totCobaias) * 100;
        perSapos =  (totSapos / (double) totCobaias) * 100;

        System.out.printf("Total: %d cobaias%n", totCobaias);
        System.out.printf("Total de coelhos: %d%n", totCoelhos);
        System.out.printf("Total de ratos: %d%n", totRatos);
        System.out.printf("Total de sapos: %d%n", totSapos);
        System.out.printf("Percentual de coelhos: %.2f %% %n", perCoelhos);
        System.out.printf("Percentual de coelhos: %.2f %% %n", perRatos);
        System.out.printf("Percentual de coelhos: %.2f %%", perSapos);

        sc.close();
    }
}
