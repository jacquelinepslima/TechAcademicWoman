package exercicio.uri.natasha_busnardo;

import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b < a){
            a = a + b;
            b = a - b;
            a = a - b;
        }

        for (int i = a; i <= b; i++) {
            if (i % 13 != 0)
                soma += i;
        }
        System.out.println(soma);
    }
}
