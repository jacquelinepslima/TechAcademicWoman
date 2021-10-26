package exercicio.uri.jacque_lima;

import java.util.Scanner;

public class Ex1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x, y, soma, total, j;

        for(int i = 0; i < N; i++){
            soma = 0;
            x = sc.nextInt();
            y = sc.nextInt();
            for(j = x, total = 0; total < y; j++){
                if(j % 2 != 0){
                    soma += j;
                    total += 1;
                }
            }
            System.out.println(soma);
        }

        sc.close();
    }
}
