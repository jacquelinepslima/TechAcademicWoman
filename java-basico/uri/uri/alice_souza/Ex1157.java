package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i=1; i<=N; i++){
            if (N%i==0)
                System.out.println(i);
        }
        sc.close();
    }
}
