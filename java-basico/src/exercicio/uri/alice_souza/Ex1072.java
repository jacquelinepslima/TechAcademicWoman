package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x, contIn = 0, contOut = 0;

        for (int i=0; i<N; i++){
            x = sc.nextInt();
            if(x>=10 && x<=20)
                contIn++;
            else
                contOut ++;
        }
        System.out.println(contIn+" in");
        System.out.println(contOut+" out");

        sc.close();
    }
}
