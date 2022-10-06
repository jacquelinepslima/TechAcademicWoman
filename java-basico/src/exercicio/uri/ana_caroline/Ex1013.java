package exercicio.uri.ana_caroline;

import java.util.Scanner;

public class Ex1013 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;
        int maiorAB;
        int maiorD;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        maiorAB = (a + b + Math.abs(a -b)) /2;

        maiorD = (maiorAB + c + Math.abs(maiorAB - c)) /2;

        System.out.println(maiorD + " eh o maior");




        scanner.close();
    }
}
