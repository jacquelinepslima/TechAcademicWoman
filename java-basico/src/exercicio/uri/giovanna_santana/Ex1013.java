package exercicio.uri.giovanna_santana;

import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int maiorAB = (A+B +Math.abs(A-B)) / 2;
        int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.printf("%d eh o maior", maiorABC);

        sc.close();
    }
}