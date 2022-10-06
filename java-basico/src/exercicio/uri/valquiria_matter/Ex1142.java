package exercicio.uri.valquiria_matter;

import java.util.Scanner;

public class Ex1142 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i < N * 4; i += 4) {
            System.out.printf("%d ", i);
            System.out.printf("%d ", i+1);
            System.out.printf("%d ", i+2);
            System.out.println("PUM");
        }
    }
}