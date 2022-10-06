package exercicio.uri.alline_cardoso;

import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();
        int soma = 0;


        while ((M > 0) && (N > 0)) {
            if (M > N) {
                for (M = M; N <= M; N++) {
                    soma = soma + N;
                    System.out.print(N + " ");
                }
                System.out.println("Sum = " + soma);
                soma = 0;
                M = scan.nextInt();
                N = scan.nextInt();
            } else {
                for (N = N; M <= N; M++) {
                    soma = soma + M;
                    System.out.print(M + " ");
                }
                System.out.println("Sum = " + soma);
                soma = 0;
                M = scan.nextInt();
                N = scan.nextInt();
            }
        }
        scan.close();
    }
}
