package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {
        int a,b,prod;
        Scanner entrada = new Scanner(System.in);
        a=entrada.nextInt();
        b=entrada.nextInt();
        entrada.close();
        prod=a*b;
        System.out.println("PROD = "+prod);
    }
}
