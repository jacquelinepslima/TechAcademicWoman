package exercicio.uri.alline_cardoso;

import java.util.Locale;
import java.util.Scanner;

public class Ex1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int qtd, c = 0, r = 0, s = 0, total;
        char tipo;

        for (int i = N; i > 0; i--) {
            qtd = scan.nextInt();
            tipo = scan.next().charAt(0);

            if (tipo == 'C') {
                c = c + qtd;
            } else if (tipo == 'R') {
                r = r + qtd;
            } else if (tipo == 'S') {
                s = s + qtd;
            }
        }
        total = c + r + s;


        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);
        System.out.printf("Percentual de coelhos: %.2f %% %n", (double) c / total * 100);
        System.out.printf("Percentual de ratos: %.2f %% %n", (double) r / total * 100);
        System.out.printf("Percentual de sapos: %.2f %% %n", (double) s / total * 100);

        scan.close();
    }
}






