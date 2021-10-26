package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int maiorAb, maiorAbc;

        maiorAb = (a + b + Math.abs(a-b)) / 2;
        maiorAbc = (maiorAb + c + Math.abs(maiorAb - c)) / 2;

        System.out.printf("%d eh o maior", maiorAbc);

        sc.close();
    }
}
