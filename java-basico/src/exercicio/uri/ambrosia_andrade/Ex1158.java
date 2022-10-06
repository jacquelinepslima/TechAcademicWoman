package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            int soma = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = 0; j < y; x++){
                if(x % 2 == 1){
                    soma +=x;
                    j++;
                }
            }
            System.out.println(soma);
        }
        sc.close();
    }
}
