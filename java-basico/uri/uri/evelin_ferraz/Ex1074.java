package exercicio.uri.evelin_ferraz;

import java.util.Scanner;

public class Ex1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n % 2 == 0 && n > 0){
            System.out.println("EVEN POSITIVE");
        } else if (n % 2 == 0 && n < 0){
            System.out.println("EVEN NEGATIVE");
        } else if (n % 2 == 1 && n > 0){
            System.out.println("ODD POSITIVE");
        } else if (n % 2 == -1 && n < 0){
            System.out.println("ODD NEGATIVE");
        } else {
            System.out.println("NULL");
        }

        sc.close();
    }
}
