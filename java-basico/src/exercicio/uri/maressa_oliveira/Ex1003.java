package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {
        int A,B,soma;
        Scanner valor = new Scanner(System.in);
        A=valor.nextInt();
        B=valor.nextInt();
        valor.close();
        soma=A+B;
        System.out.println("SOMA = "+soma);
    }
}