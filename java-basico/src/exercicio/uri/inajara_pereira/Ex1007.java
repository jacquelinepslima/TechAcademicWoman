package exercicio.uri.inajara_pereira;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira quatro digitos inteiros: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int DIFERENCA = A * B - C * D;

        System.out.printf("DIFERENÇA = %d", DIFERENCA);
        sc.close();
    }
}
