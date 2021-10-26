package exercicio.uri.giovanna_santana;

import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int out = 0;
        int in = 0;
        int X;

        for(int i = 0;  i < N; i++){
            X = sc.nextInt();
            if (X >= 10 && X <= 20){
                in = in + 1;

            } else {
                out = out + 1;

            }

        }

        System.out.println(in + " dentro ");
        System.out.println(out + " fora ");

        sc.close();
    }
}
