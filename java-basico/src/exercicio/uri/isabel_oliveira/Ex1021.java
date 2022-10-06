package exercicio.uri.isabel_oliveira;


import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int restoDivisao, n100, n50, n20, n10, n5, n2, m1,m50,m25,m10,m005,m001;
        double N;
        Scanner valor = new Scanner(System.in);
        N = valor.nextDouble();
        restoDivisao= (int) (N*100);
        n100 = restoDivisao/ 10000;
        restoDivisao = restoDivisao %10000;
        n50 = restoDivisao / 5000;
        restoDivisao = restoDivisao %5000;
        n20 = restoDivisao / 2000;
        restoDivisao = restoDivisao %2000;
        n10 = restoDivisao /1000;
        restoDivisao = restoDivisao %1000;
        n5 = restoDivisao /500;
        restoDivisao = restoDivisao %500;
        n2 = restoDivisao /200;
        restoDivisao=restoDivisao%200;
        m1= restoDivisao/100;
        restoDivisao = restoDivisao%100;
        m50= restoDivisao/50;
        restoDivisao= restoDivisao%50;
        m25= restoDivisao/25;
        restoDivisao= restoDivisao%25;
        m10= restoDivisao/10;
        restoDivisao= restoDivisao%10;
        m005= restoDivisao/5;
        m001= restoDivisao%5;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100,00%n", n100);
        System.out.printf("%d nota(s) de R$ 50,00%n", n50);
        System.out.printf("%d nota(s) de R$ 20,00%n", n20);
        System.out.printf("%d nota(s) de R$ 10,00%n", n10);
        System.out.printf("%d nota(s) de R$ 5,00%n", n5);
        System.out.printf("%d nota(s) de R$ 2,00%n", n2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n",m1);
        System.out.printf("%d moeda(s) de R$ 0.50%n",m50);
        System.out.printf("%d moeda(s) de R$ 0.25%n",m25);
        System.out.printf("%d moeda(s) de R$ 0.10%n",m10);
        System.out.printf("%d moeda(s) de R$ 0.05%n",m005);
        System.out.printf("%d moeda(s) de R$ 0.01%n",m001);
        valor.close();
    }
}
