package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        int maiorab = (a + b + Math.abs(a-b))/2;
        int maior = (maiorab + c + Math.abs(maiorab - c))/2;
        System.out.println(maior + " eh o maior");
        scan.close();


    }
}
