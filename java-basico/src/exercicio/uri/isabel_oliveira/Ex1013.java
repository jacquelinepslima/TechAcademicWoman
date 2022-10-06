package exercicio.uri.isabel_oliveira;

import java.io.IOException;
import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) throws IOException {
        int A,B,C,m;
        Scanner maior = new Scanner (System.in);
        A=maior.nextInt();
        B=maior.nextInt();
        C=maior.nextInt();

        m=(A+B+Math.abs(A-B))/2;

        if (C>m){
            m=C;
        }
        System.out.printf("%d eh o maior%n",m);
        maior.close();
    }
}
