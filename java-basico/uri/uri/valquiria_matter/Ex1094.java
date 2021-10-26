package exercicio.uri.valquiria_matter;

import java.util.Scanner;

public class Ex1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd = sc.nextInt();
        int qtdC = 0, qtdR = 0, qtdS = 0, qtdTotal = 0;

        for (int i = 0; i < qtd; i++) {

            int num = sc.nextInt();
            qtdTotal += num;
            char tipo = sc.next().charAt(0);

            if (tipo == 'C')
                qtdC += num;
            else if (tipo == 'R')
                qtdR += num;
            else if (tipo == 'S')
                qtdS += num;
        }
        double percC = (double) (qtdC * 100) / qtdTotal;
        double percR = (double) (qtdR * 100) / qtdTotal;
        double percS = (double) (qtdS * 100) / qtdTotal;
        System.out.println("Total: " + qtdTotal + " cobaias");
        System.out.println("Total de coelhos: " + qtdC);
        System.out.println("Total de ratos: " + qtdR);
        System.out.println("Total de sapos: " + qtdS);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percC);
        System.out.printf("Percentual de ratos: %.2f %%%n", percR);
        System.out.printf("Percentual de sapos: %.2f %%%n", percS);
    }
}
