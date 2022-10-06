package exercicio.uri.samyra_figueiredo;

import java.util.Scanner;

public class Ex1013 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, maiorAB, maiorBC;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        maiorAB = (a + b + Math.abs(a - b))/2;
        maiorBC = (maiorAB + c + Math.abs(maiorAB - c))/2;

        System.out.println(maiorBC + " eh o maior");

        sc.close();
    }
}