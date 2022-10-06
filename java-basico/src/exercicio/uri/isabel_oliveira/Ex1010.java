package exercicio.uri.isabel_oliveira;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        int codigoPeca1,numeroPeca1,codigoPeca2,numeroPeca2;
        double valorUnitario1,valorUnitario2,valorTotal;
        codigoPeca1=sc.nextInt();
        numeroPeca1= sc.nextInt();
        valorUnitario1=sc.nextDouble();
        codigoPeca2=sc.nextInt();
        numeroPeca2= sc.nextInt();
        valorUnitario2=sc.nextDouble();
        sc.close();
        valorTotal=numeroPeca1*valorUnitario1+numeroPeca2*valorUnitario2;
        System.out.printf("VALOR A PAGAR : R$ %.2f%n",valorTotal);
    }
}
