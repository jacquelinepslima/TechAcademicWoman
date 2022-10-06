package exercicio.uri.amanda_medeiros;

import java.util.Locale;
import java.util.Scanner;

public class Ex1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        int numero = scanner.nextInt();
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        for (int i = 0; i < numero; i++){
            int quantidade = scanner.nextInt();
            char animal = scanner.next().charAt(0);

            if(animal == 'C'){
                coelhos += quantidade;
            }
            else if(animal == 'R'){
                ratos += quantidade;
            }
            else if(animal == 'S'){
                sapos += quantidade;
            }

        }
        int total = ratos + coelhos + sapos;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.printf("Percentual de coelhos: %.2f %% %n", (double) coelhos / total * 100);
        System.out.printf("Percentual de ratos: %.2f %% %n", (double) ratos / total * 100);
        System.out.printf("Percentual de sapos: %.2f %% %n", (double) sapos / total * 100);

    }
}
