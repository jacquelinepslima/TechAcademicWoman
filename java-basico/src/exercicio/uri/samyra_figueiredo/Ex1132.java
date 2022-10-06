package exercicio.uri.samyra_figueiredo;

import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int soma = 0;

        if(X > Y){
            for(int i = Y; i <= X; i++){
                if(i % 13 != 0) {
                    soma += i;
                }
            }

        }else{
            for(int i = X; i <= Y; i++){
            if(i % 13 != 0) {
                soma += i;
            }
        }

        }
        System.out.println(soma);
        sc.close();
    }
}
