package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        int hrs, min;

        int mins1 = h1*60 + m1;
        int mins2 = h2*60 + m2;
        int minsDif = mins2 - mins1;

        hrs = minsDif/60;
        min = minsDif%60;

        System.out.println("O JOGO DUROU "+ hrs + " HORA(S) E "+ min +" MINUTO(S)");

        sc.close();
    }
}
