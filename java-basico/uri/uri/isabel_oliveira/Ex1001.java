package exercicio.uri.isabel_oliveira;

import java.util.Scanner;

public class Ex1001 {
    public static void main(String[] args) {
        int A,B,X=0;
        Scanner scanner=new Scanner(System.in);
        A=scanner.nextInt();
        B=scanner.nextInt();
        scanner.close();
        X=A+B;
        System.out.println("X = "+X);
    }
}
