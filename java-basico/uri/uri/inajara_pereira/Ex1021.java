package exercicio.uri.inajara_pereira;
import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int restoDivisao;

        System.out.println("Insira um valor em reais: R$");
        double num = sc.nextDouble();

        restoDivisao = (int) (num * 100);

        //NOTAS
        int notas100 = restoDivisao / 10000;
        restoDivisao = restoDivisao % 10000;

        int notas50 = restoDivisao / 5000;
        restoDivisao = restoDivisao % 5000;

        int notas20 = restoDivisao / 2000;
        restoDivisao = restoDivisao % 2000;

        int notas10 = restoDivisao / 1000;
        restoDivisao = restoDivisao % 1000;

        int notas5 = restoDivisao / 500;
        restoDivisao = restoDivisao % 500;

        int notas2 = restoDivisao / 200;
        restoDivisao=restoDivisao % 200;

        //MOEDAS
        int moedas1= restoDivisao / 100;
        restoDivisao = restoDivisao % 100;

        int moedas50= restoDivisao / 50;
        restoDivisao= restoDivisao % 50;

        int moedas25= restoDivisao / 25;
        restoDivisao= restoDivisao % 25;

        int moedas10= restoDivisao / 10;
        restoDivisao= restoDivisao % 10;

        int moedas5= restoDivisao / 5;

        int moedas01= restoDivisao % 5;

        System.out.println("NOTAS: ");
        System.out.printf("%d nota(s) de R$ 100,00%n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00%n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00%n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00%n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00%n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00%n", notas2);
        System.out.println();

        System.out.println("MOEDAS: ");
        System.out.printf("%d moeda(s) de R$ 1.00%n", moedas1);
        System.out.printf("%d moeda(s) de R$ 0.50%n", moedas50);
        System.out.printf("%d moeda(s) de R$ 0.25%n", moedas25);
        System.out.printf("%d moeda(s) de R$ 0.10%n", moedas10);
        System.out.printf("%d moeda(s) de R$ 0.05%n", moedas5);
        System.out.printf("%d moeda(s) de R$ 0.01%n", moedas01);

        sc.close();
    }
}
