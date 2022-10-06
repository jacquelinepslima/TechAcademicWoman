package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        int A = df.nextInt();
        int B = df.nextInt();
        int C = df.nextInt();
        int D = df.nextInt();

        int dif = (A * B) - (C * D);

        System.out.printf("DIFERENCA = " + dif);
        System.out.println();

        df.close();
    }
}
