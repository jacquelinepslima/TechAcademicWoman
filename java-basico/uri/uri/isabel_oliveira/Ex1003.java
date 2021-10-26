package exercicio.uri.isabel_oliveira;

import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {
        int A,B,SOMA=0;
        Scanner sc=new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        sc.close();
        SOMA=A+B;
        System.out.println("SOMA = "+SOMA);
    }
}
