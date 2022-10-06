package exercicio.uri.inajara_pereira;

import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Extraindo dados
        System.out.println("Insira um número inteiro: ");
        int A = sc.nextInt();
        System.out.println("Insira outro número inteiro: ");
        int B = sc.nextInt();

        //Processamento
        int SOMA = A + B;

        //Saída
        System.out.printf("SOMA%n%d + %d = %d", A, B, SOMA);

        sc.close();
    }
}
