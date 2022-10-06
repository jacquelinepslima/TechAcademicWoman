package exercicio.uri.alice_souza;

import java.util.Scanner;

public class Ex1158 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 0 ; i<N; i++){
            int soma =0;
            int X = scan.nextInt();
            int Y = scan.nextInt();
            for(int a = 0; a<Y; X++){
                if(X%2!=0){
                    soma = soma +X;
                    a++;
                }
            }
            System.out.println(soma);
        }
        scan.close();
    }
}
