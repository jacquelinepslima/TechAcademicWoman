package exercicio.uri.isabel_oliveira;

import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {
        int A,B,PROD=0;
        Scanner sc=new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        sc.close();
        PROD=A*B;
        System.out.println("PROD = "+PROD);
    }
}
