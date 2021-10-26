package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, fatorial = 1;
        n = sc.nextInt();
        for (int i = n; i > 0; i--){
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);

        sc.close();
    }
}
