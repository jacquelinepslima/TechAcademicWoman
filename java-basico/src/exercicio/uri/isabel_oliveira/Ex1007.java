package exercicio.uri.isabel_oliveira;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        int A,B,C,D,DIFERENCA=0;
        Scanner sc=new Scanner(System.in);
        A= sc.nextInt();
        B= sc.nextInt();
        C= sc.nextInt();
        D= sc.nextInt();
        sc.close();
        DIFERENCA=(A*B-C*D);
        System.out.println("DIFERENCA = "+DIFERENCA);
    }
}
