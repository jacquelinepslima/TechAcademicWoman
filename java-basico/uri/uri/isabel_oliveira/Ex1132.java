package exercicio.uri.isabel_oliveira;

import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X,Y,soma;
        X= sc.nextInt();
        Y= sc.nextInt();
        soma=0;
        if(X<Y) {
            for (int i = X; i <= Y; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        }
        else{
            for (int i = Y; i <= X; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        }
        System.out.println(soma);
        sc.close();
    }
}
