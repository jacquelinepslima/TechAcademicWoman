package exercicio.uri.maressa_oliveira;


import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
                int N, restoDivisao, n100, n50, n20, n10, n5, n2, n1;
                Scanner valor = new Scanner(System.in);
                N = valor.nextInt();
                n100 = N / 100;
                restoDivisao = N %100;
                n50 = restoDivisao / 50;
                restoDivisao = restoDivisao %50;
                n20 = restoDivisao / 20;
                restoDivisao = restoDivisao %20;
                n10 = restoDivisao /10;
                restoDivisao = restoDivisao %10;
                n5 = restoDivisao /5;
                restoDivisao = restoDivisao %5;
                n2 = restoDivisao /2;
                n1= restoDivisao %2;

                System.out.println(N);
                System.out.printf("%d nota(s) de R$ 100,00%n", n100);
                System.out.printf("%d nota(s) de R$ 50,00%n", n50);
                System.out.printf("%d nota(s) de R$ 20,00%n", n20);
                System.out.printf("%d nota(s) de R$ 10,00%n", n10);
                System.out.printf("%d nota(s) de R$ 5,00%n", n5);
                System.out.printf("%d nota(s) de R$ 2,00%n", n2);
                System.out.printf("%d nota(s) de R$ 1,00%n", n1);
                valor.close();
            }
}
