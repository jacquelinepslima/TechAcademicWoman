package exercicio.uri.maressa_oliveira;

import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = 1, n = 1, i = 0, soma = 0;
        while ((m > 0) && (n > 0)) {
            m = sc.nextInt();
            n = sc.nextInt();
            if (m > n) {
                while (i <= m) {
                    for (i = n; i <= m; i++) {
                        soma += i;
                        System.out.print(i + " ");
                    }
                }
                if((m > 0) && (n > 0)){
                    System.out.printf("Sum= %d%n" , soma);
                }soma=0;
            } else {
                while (i <= n) {
                    for (i = m; i <= n; i++) {
                        soma += i;
                        System.out.print(i + " ");
                    }
                }
                if((m > 0) && (n > 0)){
                    System.out.printf("Sum= %d%n" , soma);
                }soma=0;
            }
        }
        sc.close();
    }
}
